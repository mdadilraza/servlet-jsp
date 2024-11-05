package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);

		entityTransaction.commit();
		return student;
	}
   
	public Student fetchStudent(long phone) {
        try {
		Query query = entityManager.createQuery("select s from Student s where s.studentPhone=?1");
		query.setParameter(1, phone);
		Student student = (Student) query.getSingleResult();
		 return student;
        }catch (Exception e) {
			return null;
		}
	}
	
        
	
   

//	public List<Student> getAllStudents() {
//		Query query = entityManager.createQuery("select s from Student s");
//		List<Student> students = query.getResultList();
//		return students;
//	}
//	
	public void deleteStudentById(int id) {
	Student student=entityManager.find(Student.class, id);
	entityTransaction.begin();
	entityManager.remove(student);
	entityTransaction.commit();
	
	return ;
	}

	public Student getStudentById(int id) {
	Student student	=entityManager.find(Student.class, id);
		return student;
	}
	
	public Student updateStudent(Student student) {
		entityTransaction.begin();
	entityManager.merge(student);
	entityTransaction.commit();
	
	return student;
	}

}
