<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 17. 오전 11:18:36</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	
	<%
		out.println("scope.jsp :: " + request.getParameter("no"));
		// 내장객체 9가지
		
		// 영역객체
		// page > request > session > application
		// page 범위 private 범위와 일치
		// application 범위 public 범위와 일치
		
		// session의 범위 : session이 유지되는 동안
		
		// request의 범위 : 요청하는 동안
		// include, forward
	%>	
	<%@include file="target.jsp" %>
</body>
</html>