<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>2021. 3. 3. 오후 3:19:06</title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<th>순번</th>
			<th>이름</th>
			<th>점수</th>
		</tr>
		<tr>
			<td>1</td>
			<td>김기영</td>
			<td>50</td>
		</tr>
		<tr>
			<td>2</td>
			<td>신세영</td>
			<td>80</td>
		</tr>
		<tr>
			<td>3</td>
			<td>이여름</td>
			<td>100</td>
		</tr>
	</table>
	<input type="text" id="no">
	<input type="text" id="name">
	<input type="text" id="score">
	<button>등록</button>
	<!-- tr을 클릭했을때, 이름과 점수를 alert -->
	<!-- 등록 버튼을 클릭하면 input에 있는 각 값을 table에 동적 추가 -->
	<script>
		$("table").on("click", "tr" , function() {
			var str = "";
			$(this).find("td").each(function(i) {
				str += $(this).text() + ","
			});
			alert(str);
		});
		
		$("button").on("click", function() {
			var str = "<tr>";
			$("input:text").each(function() {
				str += "<td>" + this.value + "</td>";
				this.value = "";
			});
			str += "</tr>";
			
			$("table").append(str);
		});
	
	</script>
		
</body>
</html>