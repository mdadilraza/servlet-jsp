package Controller;

import java.io.IOException;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import dto.Person;

@WebServlet("/edit")
public class EditController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		int id = Integer.parseInt(req.getParameter("personId"));
		String name = req.getParameter("personName");
		int age = Integer.parseInt(req.getParameter("personAge"));

		String address = req.getParameter("personAddress");
		long phone = Long.parseLong(req.getParameter("personPhone"));
		String email = req.getParameter("personEmail");
		String password = req.getParameter("personPassword");

		Person person = new Person();
		person.setPersonId(id);
		person.setPersonName(name);
		person.setPersonEmail(email);
		person.setPersonAge(age);
		person.setPersonAddress(address);
		person.setPersonPhone(phone);
		person.setPersonPassword(password);

		PersonDao personDao = new PersonDao();
		Person person2 =personDao.updatePerson(person);

		 if (person2!=null) {
				List<Person> persons = personDao.getAllPersons();
				req.setAttribute("persons", persons);
				RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
				dispatcher.forward(req, resp);
			}

	}

}
