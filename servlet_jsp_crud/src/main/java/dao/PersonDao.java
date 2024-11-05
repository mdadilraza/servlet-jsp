package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

import dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);

		entityTransaction.commit();
		return person;
	}

	public Person fetchPerson(long phone) {
		Query query = entityManager.createQuery("select p from Person p where p.personPhone=?1");
		query.setParameter(1, phone);
		Person person = (Person) query.getSingleResult();
		return person;
	}

	public List<Person> getAllPersons() {
		Query query = entityManager.createQuery("select s from Person s");
		List<Person> list = query.getResultList();
		return list;
	}

	public boolean deletePerson(int id) {
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;

		}
		return false;
	}
	public Person updatePerson(Person person) {
		
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			return person;

		
	}

	public Person getPersonById(int id) {
		Person person = entityManager.find(Person.class, id);

		return person;
	}

}
