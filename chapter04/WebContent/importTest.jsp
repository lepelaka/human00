<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 17. 오전 10:19:08</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
<h1>지금 시간은 
	<%=new SimpleDateFormat("yyyy-mm-dd HH:MM:ss").format(new Date())%>
입니다</h1>
<%@ include file="index.jsp" %>
<my:a></my:a>
</body>
</html>