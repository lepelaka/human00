<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 17. 오후 12:07:19</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<h1>헤더 정보 예제</h1>
	<%
		Enumeration<String> enumeration = request.getHeaderNames();
		while(enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			String value = request.getHeader(name);
	%>
	<%=name + "::" + value + "<br>"%>
	<% }%>

		
	<hr>
	<%
		Iterator<String> iterator = new ArrayList<>(response.getHeaderNames()).iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			String value = response.getHeader(name);
			out.println(name + "::" + value + "<br>");
		}
	%>
</body>
</html>