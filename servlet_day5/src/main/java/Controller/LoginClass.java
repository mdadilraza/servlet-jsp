package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.PersonDao;
import dto.Person;

public class LoginClass extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("personEmail");
		String frontEndPassword = req.getParameter("personPassword");

		PersonDao personDao = new PersonDao();
		Person dbPerson = personDao.fetchPerson(email);

		if (frontEndPassword.equals(dbPerson.getPersonPassword())) {
			PrintWriter printWriter = res.getWriter();
			printWriter.print("Successfully Logged in");
		} else {
			PrintWriter printWriter = res.getWriter();
			printWriter.print("Invalid Credentials");
		}

	}

}
