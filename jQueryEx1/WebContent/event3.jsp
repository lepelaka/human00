<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 4. 오전 10:11:57</title>
	<style>
		#inner {padding:50px; background: yellow; width:10px; height:10px;}
		#outer {padding:50px; background: red; display: inline-block;}
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
	$(function() {
		$("#outer").mouseenter(function() {
			$("body").append("<h1>mouse enter</h1>");
		}).mouseover(function() {
			$("body").append("<h1>mouse over</h1>");
		});
		
		$(document).mousemove(function() {
			// 이벤트 객체
			$("#x").text(event.x);
			$("#y").text(event.y);
		});
		
		$("textarea")
		.keydown(function() {
			$("#length1").text($(this).val().length);
		})
		.keyup(function() {
			$("#length2").text($(this).val().length);
		})
		.keypress(function() {
			$("#length3").text($(this).val().length);
		});
	})
	</script>
</head>
<body>
	<h1>pointer x : <span id="x">0</span> y : <span id="y">0</span> </h1>
	<div id="outer">
		<div id="inner"></div>
	</div>
	<h1>현재 텍스트의 길이 값 keydown : <span id="length1">0</span></h1>
	<h1>현재 텍스트의 길이 값 keyup : <span id="length2">0</span></h1>
	<h1>현재 텍스트의 길이 값 keypress : <span id="length3">0</span></h1>
	<textarea rows="10" cols="30"></textarea>
	
	
</body>
</html>