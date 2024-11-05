package dao;

import javax.persistence.*;

import dto.Student;

public class StudentDao {
	
	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("adil");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
    public void saveStudent(Student student) {
    	entityTransaction.begin();
    	entityManager.persist(student);
    	entityTransaction.commit();
    }

}
