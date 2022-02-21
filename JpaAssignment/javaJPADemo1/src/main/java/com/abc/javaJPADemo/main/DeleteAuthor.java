package com.abc.javaJPADemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.abc.javaJPADemo.entity.Author;

public class DeleteAuthor {

public static void main(String[] args) {
// TODO Auto-generated method stub
int authorId = 3;

EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
EntityManager em = emf.createEntityManager();

Author author = em.find(Author.class, authorId);

if(author !=null) {

EntityTransaction txn = em.getTransaction();
txn.begin();

em.remove(author);

txn.commit();
System.out.println("Author Details deleted");
}
else {
System.out.println("This author is not existing: "+authorId);
}

em.clear();
em.close();
}

}
