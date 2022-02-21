package com.abc.javaJPADemo.main;


import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.javaJPADemo.entity.Product;

public class SaveProductMain {

	public static void main(String[] args) {
		
		Product product = new Product();
		//product.setProductId(20);
		product.setProductName("IPhone");
		product.setPrice(86000);
		product.setCreatedAt(LocalDate.of(2020, 01,10));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.persist(product);
		
		txn.commit();
		
		System.out.println("Product Saved.");
		
		em.close();
		emf.close();		

	}

}