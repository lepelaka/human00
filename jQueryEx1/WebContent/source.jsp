<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 4. 오후 2:27:55</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
<%
String currentPage = "1";
String countPerPage = "5";
String confmKey = "U01TX0FVVEgyMDE5MDQyNjE0NDU1MTEwODY4NDI=";
String keyword = "대학교";
String apiUrl = "https://www.juso.go.kr/addrlink/addrLinkApi.do?currentPage="+currentPage
								+"&countPerPage="+countPerPage+"&keyword="+URLEncoder.encode(keyword,"UTF-8")
								+"&confmKey="+confmKey;
System.out.println(apiUrl); // 콘솔 출력
out.println(apiUrl); // 화면 출력
%>
</body>
</html>