<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 18. 오전 9:48:48</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
<jsp:useBean id="myBean" class="test.BeanTest" scope="request"/>
<h3><%=myBean.getName()%></h3>
<h3>${myBean.name}</h3>
<jsp:setProperty property="name" name="myBean" value="일길동" />
<h3><%=myBean.getName()%></h3>
<h3>${myBean.name}</h3>
</body>
</html>