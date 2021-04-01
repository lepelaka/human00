package chapter03;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html; charset=utf-8");
		arg1.getWriter().println("<h1>hello world</h1>");
		
		Enumeration<String> paramNames = getInitParameterNames();
		while(paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			System.out.println(name + "::" + getInitParameter(name));
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		resp.getWriter().println("<h1>hello world22</h1>");
	}
	
}
