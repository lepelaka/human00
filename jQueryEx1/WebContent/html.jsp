<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 3. 오후 2:53:34</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
		$(function() {
//			alert($("body").get(0).innerHTML);
//			alert($("body").html()); // getter
			
//			$("body").get(0).innerHTML = "<h1>추가된 내용</h1>"; 
//			$("body").text("<h1>추가된 내용</h1>"); // setter
			
			// < : &lt;
			// $("body").remove(); // 내가 사라짐
			// $("body").empty(); 	// 내가 가지고 있는 애들이 사라짐
			// $("body").html("");
			
			$("h1").click(function() {
				var h1 = $(this).clone(true);
				$("body").append(h1);
			});
		});
	</script>
</head>
<body>
	<h1>hello world</h1>
</body>
</html>