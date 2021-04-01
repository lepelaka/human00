<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../../template/header.jsp" />
	<div class="btns">
		<c:if test="${not empty member}">
		<a href="write?category=${param.category}"><button>글쓰기</button></a>
		</c:if>
	</div>
	BeanDefinitionStoreException
	
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${noticeList}" var="board">
		<tr>
			<td>${board.boardno}</td>
			<td><a href="detail?boardno=${board.boardno}"><c:out value="${board.title}" /> </a></td>
			<td>${board.username}</td>
			<td>${board.regdate}</td>
			<td>${board.hitcount}</td>
		</tr>
		</c:forEach>
		<c:forEach items="${list}" var="board">
		<tr>
			<td>${board.boardno}</td>
			<td><a href="detail?boardno=${board.boardno}"><c:out value="${board.title}" /> </a></td>
			<td>${board.username}</td>
			<td>${board.regdate}</td>
			<td>${board.hitcount}</td>
		</tr>
		</c:forEach>
	</table>
<jsp:include page="../../../template/footer.jsp" />
