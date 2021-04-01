<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 2. 26. 오후 2:13:20</title>
	<style>
		h2 {text-align: center;}
	</style>
	<script>
		alert("hello");
	</script>
</head>
<body>
	<h2>안녕 세상아~</h2>
	<!-- WebContent : html, jsp root 폴더
	webapp > WEB-INF의 조상이 대부분의 root --> 
	<%
		for(int i = 0 ; i < 5 ; i++) {
			out.print("<h2>" + i + "</h2>");
		}
	%>
</body>
</html>