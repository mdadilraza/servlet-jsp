package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import dto.Person;
@WebServlet("/login")
public class LoginClass extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long phone = 0;
		try {
		 phone = Long.parseLong(req.getParameter("personPhone"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		String frontEndPassword = req.getParameter("personPassword");

		PersonDao personDao = new PersonDao();
		Person dbPerson = personDao.fetchPerson(phone);

		if ( dbPerson!=null  &&  phone==dbPerson.getPersonPhone() &&frontEndPassword.equals(dbPerson.getPersonPassword())   ) {
		List<Person> persons	= personDao.getAllPersons();
		req.setAttribute("persons", persons);
		RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
		dispatcher.forward(req, resp);
		
			

		} else {
			req.setAttribute("message", "Invalid Password");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
