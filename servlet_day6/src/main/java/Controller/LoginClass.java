package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import dto.Person;

public class LoginClass extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    long phone = Long.parseLong(req.getParameter("personPhone"));
		String frontEndPassword = req.getParameter("personPassword");

		PersonDao personDao = new PersonDao();
		Person dbPerson = personDao.fetchPerson(phone);

		if (frontEndPassword.equals(dbPerson.getPersonPassword())) {
			
			resp.sendRedirect("https://www.youtube.com/");
//			PrintWriter printWriter=resp.getWriter();
//			printWriter.print("Successfully Login ");

		} else {
			resp.sendRedirect("Login.html");
//			PrintWriter printWriter=resp.getWriter();
//			printWriter.print("Invalid credential ");
		}

	}

}
