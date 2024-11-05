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

@WebServlet("/edit")
public class EditController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("studentId"));
		String name = req.getParameter("studentName");
		int age = Integer.parseInt(req.getParameter("studentAge"));
		String DOB = req.getParameter("studentDOB");
		String address = req.getParameter("studentAddress");
		String password = req.getParameter("studentPassword");
		long phone = Long.parseLong(req.getParameter("studentPhone"));

		Student student = new Student();
		student.setStudentId(id);
		student.setStudentName(name);
		student.setStudentAge(age);
		student.setStudentDOB(DOB);
		student.setStudentAddress(address);

		student.setStudentPhone(phone);
		student.setStudentPassword(password);

		StudentDao studentDao = new StudentDao();
		Student student2 = studentDao.updateStudent(student);
		if (student2 != null) {
			Student students = studentDao.getStudentById(id);
			req.setAttribute("students", students);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
