<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 3. 오전 10:26:30</title>
	<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script> -->
	<script src="//code.jquery.com/jquery.min.js"></script>
	<script>
		$(function() {
			var id = document.getElementById("myId");
			console.log(id); // object HTMLHeadingElementObject // DOM
			// alert(id);
			var id2 = $("#myId");
			console.log(id2);
			// alert(id2); // object Object // jQuery object wrap
			
			var object = {}; // object
			var arr = []; // array
 			
			// $(document), $(window)
			alert($(id) == id2);
			
			// $(obj) 래핑시 jQuery 객체가 됨
			// .get() 호출시 jQuery 객체 > DOM
			// [] 호출시 jQuery 객체 > DOM
			
			alert(id2.get(0) === id);
			alert(id2[0] === id);
			
			// 
			var flag = false;
			// alert(!!!!!!!!!!flag)
			alert($(id2[0])[0]);
			
		})
	</script>
</head>
<body>
	<h1 id="myId"></h1>
</body>
</html>