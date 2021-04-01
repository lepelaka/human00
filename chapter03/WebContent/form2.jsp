<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 15. 오후 2:38:31</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<form method="get">
		<ul>
			<li>아이디 <input type="text" name="id"></li> 
			<li>비밀번호 <input type="password" name="pw"></li> 
			<li><button>로그인</button></li>
		</ul> 
	</form>	
	<%=request.getParameter("id")%><br>
	<%=request.getParameter("pw")%>
</body>
</html>