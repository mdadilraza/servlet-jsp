package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Person;
import dto.Product;

public class PersonDao {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("adil");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public void savePerson(Person person ) {
		entityTransaction.begin();
		entityManager.persist(person);
		
		entityTransaction.commit();
	}
	public Person fetchPerson(long phone ) {
		Query query = entityManager.createQuery("select p from Person p where p.personPhone=?1");
		 query.setParameter(1, phone);
		Person person= (Person) query.getSingleResult();
	    return person;
	}
	
	
	
	
}
