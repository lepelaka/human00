<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 5. 오전 9:05:57</title>
	<style>
	table {border:1px solid black; border-collapse: collapse; table-layout: fixed; width: 800px; margin:0 auto}
	td, th {border: 1px solid black; padding:10px; width: 25%}
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
	$(function() {
		$("button").click(function() {
			var xmlUrl = 'https://www.juso.go.kr/addrlink/addrLinkApi.do?currentPage=1&countPerPage=5&keyword=%EB%8C%80%ED%95%99%EA%B5%90&confmKey=U01TX0FVVEgyMDE5MDQyNjE0NDU1MTEwODY4NDI=';
			var jsonUrl = "";
			$.ajax(xmlUrl).done(function(data, msg, xhr) {
				console.log(data);
				var str = "<table>";
				$(data).find("juso").each(function(i) {
					str += "<tr>";
					str += "<td>" + $(this).find("bdNm").text() + "</td>";
					str += "<td>" + $(this).find("zipNo").text() + "</td>";
					str += "<td>" + $(this).find("roadAddr").text() + "</td>";
					str += "<td>" + $(this).find("jibunAddr").text() + "</td>";
					str += "</tr>";
				});
				str += "</table>";
				
				$("body").append(str);
				// results
				// juso
				// bdNm, zipNo, road_addr, jibun_addr
			})
		})
	})
	</script>
</head>
<body>
	<button>ajax 호출</button>
</body>
</html>