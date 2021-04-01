<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 4. 오전 9:28:16</title>
	<style>
		a {color:black;}
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
	$(function() {
		/* $("h1").on({
			"mouseenter" : function() {
				$(this).css({color:"red", backgroundColor:"black"})
			},
			"mouseleave" : function() {
				$(this).css({color:"black", backgroundColor:"white"})
			}
		}); */
		
		$("h1").hover(function() {
			$(this).css({color:"red", backgroundColor:"black"})
		},function() {
			$(this).css({color:"black", backgroundColor:"white"})
		});
		
		$("h1").off("mouseleave");
		
		// 이벤트 전달
		$("a").click(function() {
			$(this).css("background", "gray"); // 사용자 정의 이벤트
			// event.preventDefault(); // 기본이벤트 제거
			// event.stopPropagation(); // 이벤트 전달 중지
			return false;
		})
		$('h2').click(function() {
			$(this).css("background", "blue");
		});
	});
	</script>
</head>
<body>
	<h1>안녕하세요</h1>
	<h1>적당히 시원한 바람이</h1>
	<h1>불어 기분이 좋아요. 유후~</h1>
	
	<h2><a href="https://www.naver.com">링크</a></h2>	
</body>
</html>