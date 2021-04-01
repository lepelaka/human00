<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 18. 오전 10:27:18</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<jsp:useBean id="test2" class="test.BeanTest2" />
	<jsp:setProperty property="*" name="test2"/>
	<p>${test2}</p>
</body>
</html>