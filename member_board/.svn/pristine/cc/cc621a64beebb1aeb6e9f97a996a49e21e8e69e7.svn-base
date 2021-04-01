<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 17. 오후 12:44:01</title>
	<link rel="stylesheet" href="/member_board/assets/css/common.css">
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script src="https://cdn.ckeditor.com/ckeditor5/11.0.1/classic/ckeditor.js"></script>
</head>
<body>
	<div class="wrapper">
	<header class="header">
		<h1>사이트 이름 : 제목</h1>
		<form method="post" action="<%=request.getContextPath()%>/login">
		<ul>
		<c:if test="${empty member}">
			<li><label>아이디 <input type="text" name="id" value="${cookie.idsave.value}"></label></li>
			<li><label>비밀번호 <input type="password" name="pw"></label></li>
			<li><button>로그인</button></li>
			<li>
				<label> 아이디 저장 
					<input type="checkbox" name="idsave" ${empty cookie.idsave.value ? '' : 'checked'}></label>
			</li>
		</c:if>
		<c:if test="${!empty member}">
			<li>${member.name}님 환영합니다. <button formmethod="get" formaction="<%=request.getContextPath()%>/logout">로그아웃</button></li>
		</c:if>
		</ul>
		</form>
		<script>
			$("<input>").attr({type:"hidden", name:"uri", value:location.pathname+location.search}).appendTo("form");
		</script>
	</header>
	<nav class="gnb">
		<ul>
		
			<li><a href="<%=request.getContextPath()%>/board/list?category=1">자유게시판</a></li>
			<li><a href="<%=request.getContextPath()%>/board/list?category=2">공지사항</a></li>
			<li><a href="<%=request.getContextPath()%>/board/list?category=3">Q/A</a></li>
			<li><a href="<%=request.getContextPath()%>/board/list?category=4">자료실</a></li>
		</ul>
	</nav>