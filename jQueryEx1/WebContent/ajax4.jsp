<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 5. 오전 9:05:57</title>
	<style>
	table {border:1px solid black; border-collapse: collapse; table-layout: fixed; width: 800px; margin:0 auto}
	td, th {border: 1px solid black; padding:10px;}
	</style>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
	$(function() {
		// RSS
		$("button").click(function() {
			var xmlUrl = 'chosun';
			var jsonUrl = "";
			$.ajax(xmlUrl).done(function(data, msg, xhr) {
				console.log(data);
				var str = "<table>";
				$(data).find("item").each(function(i) {
					str += "<tr>";
					str += "<td>" + (i+1) + "</td>";
					str += "<td><a href='" + $(this).find("link").text() + "'>" 
						+  $(this).find("title").text() + "</a></td>";
					str += "<td>" + $(this).find("author").text() + "</td>";
					str += "<td>" + $(this).children().eq(3).text() + "</td>";
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