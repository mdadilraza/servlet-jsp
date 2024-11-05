package servlet_day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sqaure extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int result=(int) req.getAttribute("result");
		result*=result;
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("The square is :"+result);
		
	}

}
