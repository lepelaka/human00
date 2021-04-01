<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 4. 오후 12:37:33</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
		$(function() {
			$("button").click(function() {
				/* jQuery.ajax({
					url : "NewFile.xm",
					success : function(data, msg, xhr) {
						// console.log(data);
						var str = "<table>";
						$(data).find("student").each(function() {
							str += "<tr>"
							str += "<td>" + $(this).find("no").text() + "</td>";
							str += "<td>" + $(this).find("name").text() + "</td>";
							str += "<td>" + $(this).find("kor").text() + "</td>";
							str += "<td>" + $(this).find("eng").text() + "</td>";
							str += "<td>" + $(this).find("mat").text() + "</td>";
							str += "</tr>"
						});
						str += "</table>"
						$("body").append(str);
						console.log(msg)
						console.log(xhr)
					},
					error : function(a, b, c) {
						console.log(a) // xhr
						console.log(b) // msg status(string)
						console.log(c) // error thorwn
					},
					complete : function() {
						alert("완료");
					}
				}); */
				var url = 'https://www.juso.go.kr/addrlink/addrLinkApi.do?currentPage=1&countPerPage=5&keyword=%EB%8C%80%ED%95%99%EA%B5%90&confmKey=U01TX0FVVEgyMDE5MDQyNjE0NDU1MTEwODY4NDI=';
//				$.ajax("http://localhost:8080/jQueryEx1/NewFile.xml").done(function(data, msg, xhr) {
				$.ajax(url).done(function(data, msg, xhr) {
					console.log(data);
				})
				
				// cross domain
				// 출처 소스가 어디에서 나왔는가?
						
				// ajax.jsp >> localhost
				// ajax를 통해 가져오려는곳 >> juso.go.kr
				
				// 1. proxy server로 경유
				// 2. jsonp 
				// xml로 직접 가져오는것은 불가 jsonp
			});
		});
	</script>
</head>
<body>
	<button>ajax 호출</button>
</body>
</html>