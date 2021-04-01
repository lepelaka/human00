<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 4. 오후 12:37:30</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
	<script>
		$(function() {
			 $("button").click(function() {
				 /*
				$.ajax({
					url : "NewFile.xm",
					success : function(data, msg, xhr) {
//						alert(data); // object
						console.log(data);
						var str = "<table>";
						$(data).find("student").each(function() {
							str += "<tr>"
							str += "<td>" + $(this).find("no").text() + "</td>"; // this는 student
							str += "<td>" + $(this).find("name").text() + "</td>";
							str += "<td>" + $(this).find("kor").text() + "</td>";
							str += "<td>" + $(this).find("eng").text() + "</td>";
							str += "<td>" + $(this).find("mat").text() + "</td>";
							str += "</tr>"
						});
						str += "</table>"
						$("body").append(str);
						console.log(msg);
						console.log(xhr);
					},
					error : function(a, b, c) {
						console.log(a); // xhr
						console.log(b); // msg status(string)
						console.log(c); // error thrown
					},
					complete : function() { // 많이 안 씀.
						alert("완료");
					}
				});	 */
				
				$.ajax("http://localhost:8080/jQueryEx1/NewFile.xml").done(function(data, msg, xhr) {
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
					console.log(msg);
					console.log(xhr);
				});
			});
		});
	</script>
</head>
<body>
	<button>ajax 호출</button>	
</body>
</html>