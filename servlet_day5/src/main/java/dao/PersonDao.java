package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

//insert data 
	public void savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
//fetchPersonByEmail
	public Person fetchPerson(String email) {
		Query query = entityManager.createQuery("select p from Person p where p.personEmail=?1");
		 query.setParameter(1, email);
		Person person= (Person) query.getSingleResult();
	

		return person;
	}

}
