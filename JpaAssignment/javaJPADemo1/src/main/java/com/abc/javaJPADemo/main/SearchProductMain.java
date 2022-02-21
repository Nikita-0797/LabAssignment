package com.abc.javaJPADemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.javaJPADemo.entity.Product;

public class SearchProductMain {

	public static void main(String[] args) {
	
		int productId = 20;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Product product = em.find(Product.class, productId);
		
		if(product !=null) {
			System.out.println("Name: " +product.getProductName());
			System.out.println("Price: " +product.getPrice());
			System.out.println("Created At: " +product.getCreatedAt());
		}
		else {
			System.out.println("Product not existing with id: "+productId);
		}
		
		em.clear();
		em.close();

	}

}
