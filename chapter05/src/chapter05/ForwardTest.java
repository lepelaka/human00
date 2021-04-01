package chapter05;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardTest extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Servlet :: " + arg0.getParameter("no"));
		Writer w = arg1.getWriter();
		arg0.getRequestDispatcher("scope.jsp").forward(arg0, arg1);
	}
	
}
