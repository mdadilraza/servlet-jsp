package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import dto.Person;

@WebServlet("/delete")
public class PersonDeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int	id = Integer.parseInt( req.getParameter("id"));

		PersonDao personDao = new PersonDao();
		boolean result = personDao.deletePerson(id);
		if (result) {
			java.util.List<Person> persons = personDao.getAllPersons();
			req.setAttribute("persons", persons);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
