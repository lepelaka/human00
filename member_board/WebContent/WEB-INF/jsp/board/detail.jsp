<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../../../template/header.jsp" />
	<table>
		<tr>
			<th>제목</th>
			<td colspan="5">${board.title}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.username}</td>
			<th>작성일</th>
			<td>${board.regdate}</td>
			<th>조회수</th>
			<td>${board.hitcount}</td>
		</tr>
		<tr>
			<td>
				<c:forEach items="${board.attachs}" var="attach">
				<a class="dl" href="/upload/${attach.uploadPath}/${attach.uuid}">${attach.fileName}</a>				
				</c:forEach> 
			</td>
		</tr>
		<tr>
			<td colspan="6">
				${board.content}
			</td>
		</tr>
	</table>
	
	<div class="reply-wrap">
		<div class="reply-header">
			<div>댓글 <span>${fn:length(replies)}</span></div>
			<div><button class="reply-content-toggle">댓글 닫기</button></div>
		</div>
		
		<div class="reply-content-wrapper">
		<c:forEach items="${replies}" var="reply">
		<div class="reply-content">
			<div class="reply-content-header">
				<span>${reply.username}</span>
				<span>${reply.regdate}</span>
			</div>
			<div class="reply-body">${reply.content}</div>
			<div class="reply-form reply-modify">
				<form method="post" action="modifyReply">
					<textarea rows="10" cols="30" name="content">${reply.content}</textarea>
					<input type="hidden" name="boardno" value="${board.boardno}">
					<input type="hidden" name="replyno" value="${reply.replyno}">
					<button>댓글등록</button>
				</form>
			</div>	
			<div class="reply-btns">
				<c:if test="${not empty member && member.userid == reply.userid}">
				<form action="removeReply" method="post">
					<button type="button" class="btn-modify">수정</button>
					<input type="hidden" name="replyno" value="${reply.replyno}">	
					<input type="hidden" name="boardno" value="${board.boardno}">		
					<button>삭제</button>
				</form>
				</c:if>
			</div>
		</div>
		</c:forEach>
		</div>
		
		
		<div class="reply-form">
			<form method="post" action="writeReply">
				<textarea rows="10" cols="30" name="content"></textarea>
				<input type="hidden" name="boardno" value="${board.boardno}">
				<button>댓글등록</button>
			</form>
		</div>		
	</div>
	
	<div class="btns">
		<c:if test="${not empty member && member.userid == board.userid}">
		<a href="modify?boardno=${param.boardno}"><button>글수정</button></a>
		<a href="remove?boardno=${param.boardno}"><button>글삭제</button></a>
		</c:if>
		<button class="do-prev">목록으로</button>
	</div>
	
	<script>
	
		$(".dl").click(function() {
			event.preventDefault();
			var realPath = encodeURIComponent($(this).attr("href"));
			var fileName = encodeURIComponent($(this).text());
			
			console.log(realPath);
			console.log(fileName);
			
			var dlURI = '<%=request.getContextPath()%>/download';
			dlURI += '?realPath=' + realPath;
			dlURI += '&fileName=' + fileName;
			console.log(dlURI);
			
			location.href = dlURI;
		});
		
		$(".reply-content-toggle").click(function() {
			var $wrap = $(".reply-content-wrapper");
			if($wrap.is(":visible")) { // 현재 열려있을때
				$(this).text("댓글 열기");
				$wrap.stop().slideUp(0);
			}
			else { //  현재 닫혀있을때
				$(this).text("댓글 닫기");
				$wrap.stop().slideDown(0);
			}
		});
		
		$(".btn-modify").on("click",function() {
			$(".reply-form").hide();
			$(this).parent().parent().prev().show();
		});
	</script>
<jsp:include page="../../../template/footer.jsp" />
