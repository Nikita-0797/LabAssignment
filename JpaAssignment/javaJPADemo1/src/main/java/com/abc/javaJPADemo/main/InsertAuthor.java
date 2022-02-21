package com.abc.javaJPADemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import com.abc.javaJPADemo.entity.Author;



public class InsertAuthor {



public static void main(String[] args) {
// TODO Auto-generated method stub
Author author = new Author();
//author.setAuthorId(1);
author.setFirstName("Ritesh");
author.setLastName("Kangude");
author.setPhoneNo("7350718158");



EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
EntityManager em = emf.createEntityManager();



EntityTransaction txn = em.getTransaction();
txn.begin();



em.persist(author);



txn.commit();



System.out.println("Author Details Saved");



em.close();
emf.close();

}

}
