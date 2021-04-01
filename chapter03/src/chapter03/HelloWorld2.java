package chapter03;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

@WebServlet(urlPatterns= {"/hello2", "/hello3", "/hello4"}, initParams = {
		@WebInitParam(name="name", value="구본희") ,
		@WebInitParam(name="age", value="29") ,
		@WebInitParam(name="married", value="y")
})
public class HelloWorld2 extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html; charset=utf-8");
		arg1.getWriter().println("<h1>hello world</h1>");
		HttpSession session = arg0.getSession();
		
		Enumeration<String> paramNames = getInitParameterNames();
		while(paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			System.out.println(name + "::" + getInitParameter(name));
		}
	}
}
