<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 18. 오전 11:36:43</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<%
		if(exception instanceof ArithmeticException) {
			out.println("<h3>0으로 나눌수 없습니다</h3>");
		}
		if(exception instanceof NumberFormatException) {
			out.println("<h3>숫자를 입력하세요</h3>");
		}
	%>
	
</body>
</html>