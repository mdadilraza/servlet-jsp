package Controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import dto.Person;

public class SignUp extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		String name = req.getParameter("personName");
		int age = Integer.parseInt(req.getParameter("personAge"));

		String address = req.getParameter("personAddress");
		long phone = Long.parseLong(req.getParameter("personPhone"));
		String email = req.getParameter("personEmail");
		String password = req.getParameter("personPassword");

		Person person = new Person();
		person.setPersonName(name);
		person.setPersonEmail(email);
		person.setPersonAddress(address);
		person.setPersonPhone(phone);
		person.setPersonPassword(password);

		PersonDao personDao = new PersonDao();
		personDao.savePerson(person);

		resp.sendRedirect("Login.html");

	}

}

