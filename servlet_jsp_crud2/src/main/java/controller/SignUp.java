package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;
@WebServlet("/signup")
public class SignUp extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name	=req.getParameter("studenName");
		int age	=Integer.parseInt(req.getParameter("studentAge"));
		String dob	=req.getParameter("studenDOB");
		String address	=req.getParameter("studentAddress");
		Long phone	=Long.parseLong( req.getParameter("studentPhone"));
		String password	=req.getParameter("studentPassword");
		
		Student student= new Student();
		student.setStudentName(name);
		student.setStudentAge(age);
		student.setStudentDOB(dob);
		student.setStudentAddress(address);
		student.setStudentPhone(phone);
		student.setStudentPassword(password);
		
		StudentDao studentDao= new StudentDao();
		Student dbStudent=studentDao.saveStudent(student);
		
		if(dbStudent!=null) {
       	 req.setAttribute("message", "Successfully Signed Up Please proceed for login");
       	 RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
       	 dispatcher.forward(req, resp);
        }
		
		
	
		
	}

}
