<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 4. 오전 11:11:03</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
		$(function() {
			$("#id").change(function() {
				// 체크상태 확인
				// 체크하거나 해제하거나
				var ck = this.checked; //js dom
				//var ck = $(this).prop("checked");
				
/* 				$(":checkbox").each(function() {
					this.checked = ck;
				}); */
				
				$(":checkbox").prop("checked", ck);
			});
			$("h1").click(function() {
				$(this).next().hide(1000, function() {
					alert("완료");
				});
			});
			
			// 더블클릭 = 2클릭
		})
	</script>
</head>
<body>
	<input type="checkbox" id="id"> 전체 선택
	<hr>
	<input type="checkbox"> A
	<input type="checkbox"> B
	<input type="checkbox"> C
	
	<h1>여기를 누르세요</h1>
	<h2>이것이 대상입니다.</h2>
	<h1>여기를 누르세요</h1>
	<h2>이것이 대상입니다.</h2>
	<h1>여기를 누르세요</h1>
	<h2>이것이 대상입니다.</h2>
</body>
</html>