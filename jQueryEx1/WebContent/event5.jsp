<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 4. 오후 12:13:02</title>
	<style>
	div {width: 50px; height:50px; background: yellow;}
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
	var javaman = $;
	javaman(function() {
		javaman("div").click(function() {
			javaman(this).stop().animate({
				width : '+=50',
				height : '+=50'
			}, "slow");
		}).dblclick(function() {
			javaman(this).stop().animate({
				width : '-=50',
				height : '-=50'
			}, "slow");
		});
		
		// .stop
		
		
	})
	</script>
</head>
<body>
	<div></div>
</body>
</html>