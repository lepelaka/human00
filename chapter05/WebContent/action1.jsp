<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 17. 오후 12:34:25</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<h1>action1</h1>
	<%
		// request.getRequestDispatcher("action2.jsp").forward(request, response);
	%>
	<%-- <jsp:forward page="action2.jsp" /> --%>
	<jsp:include page="action2.jsp"/>
</body>
</html>