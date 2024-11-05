package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Student;

public class StudentSignIn  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String userName	=req.getParameter("userName" );
	String password =req.getParameter("password");
	Student student= new Student();
	if((userName!=null && userName.equals(student.getStudentUserName())) ) {
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("successfully Login");
		
	}
	else {
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("Invalid credential...");
		printWriter.println(userName+" "+password);
		printWriter.println(student.getStudentUserName());
	}
	
	}
	

}
