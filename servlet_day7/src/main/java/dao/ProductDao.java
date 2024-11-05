package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Product;

public class ProductDao {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("adil");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public void saveProduct(Product product ) {
		entityTransaction.begin();
		entityManager.persist(product);
		
		entityTransaction.commit();
	}

}
