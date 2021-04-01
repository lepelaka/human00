<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.UUID"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 18. 오후 12:08:33</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<form method="post" enctype="multipart/form-data">
		<input type="text" name="id">
		<input type="text" name="name"> 
		<input type="file" name="myFile" >
		<button>전송</button>
	</form>
	<%=request.getMethod()%>
	<%=request.getRealPath("/upload") %>
	<%
		
		if(request.getMethod().equals("POST")) {
			MultipartRequest multi = new MultipartRequest(request, request.getRealPath("/upload"), 2 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());

			String id = multi.getParameter("id");
			String name = multi.getParameter("name");
			out.println(id);
			out.println(name);
			
			String fileSystemName = multi.getFilesystemName("myFile");
			String originalFileName = multi.getOriginalFileName("myFile");
			String type = multi.getContentType("myFile");
			File file = multi.getFile("myFile"); 
			out.println("<br>");
			out.println(fileSystemName+"<br>");
			out.println(originalFileName+"<br>");
			out.println(type+"<br>");
			out.println(file.length()+"<br>");
			
		}
	%>
	<img alt="" src="upload/20200723055344399.png">
</body>
</html>