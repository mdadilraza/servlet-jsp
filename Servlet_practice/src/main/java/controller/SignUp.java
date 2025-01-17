package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;

public class SignUp extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

		String userName	=req.getParameter("userName");
		String email	=req.getParameter("email");
		String stringPhone	=req.getParameter("Phone");
		String password	=req.getParameter("password");
		
		Student student = new Student();
		student.setStudentEmail(email);
		student.setStudentPassword(password);
		if(stringPhone !=null)
		student.setStudentPhone(Long.parseLong(stringPhone));
		student.setStudentUserName(userName);
		
		StudentDao studentDao= new StudentDao();
		studentDao.saveStudent(student);
		
	
		
		
		

	}

}
