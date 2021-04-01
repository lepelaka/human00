package chapter03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login-form")
public class ServletStruct extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 페이지 포워드
		req.getRequestDispatcher("form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 아이디, 패스워드 값 확인
		req.setCharacterEncoding("utf-8"); // 한글처리
		System.out.println(req.getParameter("id"));
		System.out.println(req.getParameter("pw"));
		// get으로 리다이렉트
		
//		resp.sendRedirect("login-form");
	}
	
}
