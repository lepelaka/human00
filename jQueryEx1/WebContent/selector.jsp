<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 3. 오후 12:34:56</title>
	<style>
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
	$(function() {
		// js object key -표기 못합니다. why 식별자 작성법 규칙을 따르기때문
		// 1. key를 '', ""로 래핑해서 문자열화
		// 2. 카멜 표기법으로 전환
		var obj = {};
		obj.color = "red";
		obj["text-decoration"] = "underline";
		
		var arr = ["1.2em", "1.5em"];
		/* $("h3")
		.css("color", "red")
		.css({textDecoration:"underline"})
			.filter(":odd")
			.css("background", "orange")
				.first()
				.css("color", "blue")
			.end()
		.end()
		.css("border", "1px solid black")
		.css("font-size", function(i) {
			return arr[i%2];
		})
		.css("font-style", "italic")
			.eq(2).css("color", "black").click(function() {
				alert(this.innerText);
			}).click()
		.end()
			.filter(function(i) {
				return i%2 == 0;
			}); 
			$("h3")
			.css("color","red")
			.css({textDecoration:"underline"})
				.filter(":odd")
				.css("background", "orange")
					.first()
					.css("color","blue")
				.end()
			.end()
			.css("border","1px solid black")
			.css("font-size", function(i, style) {
				return arr[i%2];	
			})
			.css("font-style", "italic")
				.eq(2).css("color", "black").click(function() {
					alert(this.innerText);
				}).click()
			.end();
 */

		
		// why? chaining 
		//$("h3").get(0).style["background-color"] = "blue"
		
		/* $.each(window, function(i, item) {
			document.write(i, ":::" , item, "<br>");
		});
 
 		for(var i in window) {
 			document.write(i, ":::" , window[i], "<br>");
 		} */
 		
 		$("h3").each(function(i) { // for
 			console.log(i, ":::", this);
 		})
 		var obj = {name : "자바맨"};
 		var obj2 = {age : 39, addr : "성정동"};
 		/* obj.age = 39;
 		obj.addr = "성정동"; */
 		$.extend(obj, obj2)
 		console.log(obj);
 		// 
	});
	</script>
</head>
<body>
	<h3>텍스트 내용 1</h3>	
	<h3>텍스트 내용 2</h3>	
	<h3>텍스트 내용 3</h3>	
	<h3>텍스트 내용 4</h3>	
	<h3>텍스트 내용 5</h3>	
	<h3>텍스트 내용 6</h3>	
</body>
</html>