<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>"D:/tools/workspaces/workspace-web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/work/Catalina/localhost/chapter04/org/apache/jsp/script_jsp.java"
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 17. 오전 10:41:39</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<%-- 선언문 --%>
	<%!
		int a = 10; // 인스턴스 변수
	%>	
	<%!
		String print() {
			return "안녕하세요";
		}
	%>
	<%-- 스크립틀릿 --%>
	<%
		int a = 20; // 지역 변수
	%>	
	<%-- 표현식 --%>
	<%=10
	%>	
	<%=a %>
	<%=print() %>
</body>
</html>