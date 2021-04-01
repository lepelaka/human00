<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 3. 오전 11:29:54</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
		$(function() {
			$("input[type='text']").val("휴먼 교육센터");

			setTimeout(function () {
				var value = $("select option:selected").val();
				alert(value);
				
				$("input:text").val("click me");
				$("input:button").val("click me");
			}, 3000);
			
		});
	</script>
</head>
<body>
	<input type="text" value="your name">
	<select>
		<option>oracle</option>
		<option selected>java</option>
	</select>
	<input type="button" value="click">
</body>
</html>