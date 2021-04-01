<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 3. 오후 12:14:21</title>
	<style>
	body {cursor: pointer;}
	div {width: 50px; height:30px; margin:10px; float:left; background: blue;}
	span {color:red}
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
		$(function() {
			$(document.body).click(function() {
				$(this).append("<div>");
				var size = $("div").size();
				$("span").text("div가 " + size + "개 있습니다.")
			}).click();
		});
	</script>
</head>
<body>
	<span></span>
	<hr>
	<div></div>	
</body>
</html>