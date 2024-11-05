package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;
@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//	 long frontendPhone=Long.parseLong(	req.getParameter("studenPhone"));
//		
//	String frontendPassword=req.getParameter("studentPassoword");
//	
//	StudentDao studentDao= new StudentDao();
//	Student student=studentDao.fetchStudent(frontendPhone);
//	if(student!=null) {
//	if(frontendPhone==student.getStudentPhone()&&frontendPassword.equals(student.getStudentPassword())  ){
//	Student students	= studentDao.fetchStudent(frontendPhone);
//	req.setAttribute("students", students);
//	RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
//	dispatcher.forward(req, resp);
//	
//		
//
//	} else {
//		req.setAttribute("message", "Invalid Password ,please provide valid credential");
//		RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
//		dispatcher.include(req, resp);
//	}
//		
//	}
//	}
//	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String frontendPhoneStr = req.getParameter("studenPhone");
	    String frontendPassword = req.getParameter("studentPassword");

	    // Check if the phone number is provided
	    if (frontendPhoneStr == null || frontendPhoneStr.isEmpty()) {
	        req.setAttribute("message", "Phone number is required");
	        RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
	        dispatcher.include(req, resp);
	        return; // Exit the method
	    }

	    long frontendPhone;
	    try {
	        frontendPhone = Long.parseLong(frontendPhoneStr);
	    } catch (NumberFormatException e) {
	        req.setAttribute("message", "Invalid phone number");
	        RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
	        dispatcher.include(req, resp);
	        return; // Exit the method
	    }

	    StudentDao studentDao = new StudentDao();
	    Student student = studentDao.fetchStudent(frontendPhone);

	    // Check if the student exists and password matches
	    if (student != null && frontendPhone==student.getStudentPhone() && frontendPassword.equals(student.getStudentPassword()) ) {
	        Student students = studentDao.fetchStudent(frontendPhone);
	        req.setAttribute("students", students);
	        RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
	        dispatcher.forward(req, resp);
	    } else {
	        req.setAttribute("message", "Invalid Password, please provide valid credentials");
	        RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
	        dispatcher.include(req, resp);
	    }
	}

	
		
	}


