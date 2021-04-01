<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 19. 오후 12:49:50</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<%
		String str = "hello";
		// el의 목적 : 영역객체에 저장된 변수에 접근하기 위해 사용
		pageContext.setAttribute("page", "페이지값");
		request.setAttribute("req", "요청값");
		session.setAttribute("sess", "세션값");
		application.setAttribute("app", "어플값");

		pageContext.setAttribute("key", "페이지값");
		request.setAttribute("key", "요청값");
		session.setAttribute("key", "세션값");
		application.setAttribute("key", "어플값");
		
		
	%>
	<p><%=str%></p>
	<p>${str}</p>
	
	<p><%=pageContext.getAttribute("page")%></p>
	<p>${page}</p>
	<p>${req}</p>
	<p>${sess}</p>
	<p>${app}</p>
	
	<h3>${sessionScope.key}</h3>
	
	<form>
		<input type="text" name="name"> <br>
		소고기 <input type="checkbox" name="meat" value="beef"> 
		돼지고기 <input type="checkbox" name="meat" value="pork">
		닭고기 <input type="checkbox" name="meat" value="chicken">
		<button>전송</button>
	</form>
	
	<h2>표현식을 사용 하였을때</h2>
	<h3>이름 : <%=request.getParameter("name")%></h3>
	<%-- <h3>고기들 : <%=request.getParameterValues("meat")[0] %></h3>
	<h3>고기들 : <%=request.getParameterValues("meat")[1] %></h3>
	<h3>고기들 : <%=request.getParameterValues("meat")[2] %></h3> --%>
	<h2>표현 언어를 사용하였을때</h2>
	<h3>이름 : ${param.name}</h3>
	<h3>고기들 : ${paramValues["meat"][0]}</h3>
	<h3>고기들 : ${paramValues.meat[1]}</h3>
	<h3>고기들 : ${paramValues.meat[2]}</h3>
	<h3>저장된 쿠키 : ${cookie.idsave}</h3>
	
	
	<h4>\${5+7} : ${5+7}</h4>
	<h4>\${5-7} : ${5-7}</h4>
	<h4>\${5*7} : ${5*7}</h4>
	<h4>\${5/7} : ${5/7}</h4>
	<h4>\${5%7} : ${5%7}</h4>
	
</body>
</html>