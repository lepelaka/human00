<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="chapter14.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 19. 오후 2:28:02</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<% 
		Emp emp = new Emp();
		emp.setEname("SMITH");
		emp.setDeptno(101);
		emp.setSal(5000);
		
		request.setAttribute("emp", emp);
	%>
	<jsp:useBean id="emp2" class="chapter14.Emp" />
	<jsp:setProperty property="ename" name="emp2" value="SCOTT" />
	<c:set var="myStr" scope="request" value="Hello World" /> 
<pre>
	${emp}	
	${emp.ename}	
	${emp.sal}	
	${emp.deptno}	

	${emp2}	
	${emp2.ename}	
	${emp2.sal}	
	${emp2.deptno}
	
	${myStr}	
	
	<c:remove var="emp2" />
	${emp2}
</pre>
<h2>&lt;c:if>문&lt;/c:if></h2>
<c:if test="${5 > 7}">
	<h3>5 > 7</h3>
</c:if>
<c:if test="${5 < 7}">
	<h3>5 &lt; 7</h3>
</c:if>

<c:set var="score" value="95" />
<c:choose>
	<c:when test="${score >= 90 }">
		<h3>A학점</h3>
	</c:when>
	<c:when test="${score >= 80 }">
		<h3>B학점</h3>
	</c:when>
	<c:when test="${score >= 70 }">
		<h3>C학점</h3>
	</c:when>
	<c:when test="${score >= 60 }">
		<h3>D학점</h3>
	</c:when>
	<c:otherwise>
		<h3>F학점</h3>
	</c:otherwise>
</c:choose>

<%
	HashMap<String, String> map = new HashMap<>();
	map.put("A", "가");
	map.put("B", "나");
	map.put("C", "다");
	map.put("D", "라");
	
	request.setAttribute("map", map);
	
	ArrayList<Integer> list = new ArrayList<>();
	list.add(15);
	list.add(5);
	list.add(1);
	list.add(3);
	list.add(20);
	
	request.setAttribute("list", list);
%>
<c:forEach begin="2" end="9" var="i">
	<c:forEach var="j" begin="1" end="9">
		<h4>${i} * ${j} = ${i*j}</h4>
	</c:forEach>
</c:forEach>

<c:forEach items="${map}" var="m">
	<h4>${m}</h4>
</c:forEach>

<c:forEach items="${list}" var="l">
	<h4>${l}</h4>
</c:forEach>

<c:forTokens items="a, b, c, d, e, f, g, h" delims="," var="a">
	<h4>${a}</h4>
</c:forTokens>

</body>
</html>