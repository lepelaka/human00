package board.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.service.BoardService;
import board.service.BoardServiceImpl;
import board.vo.Attach;
import board.vo.Board;
import member.vo.Member;
import util.Common;

@WebServlet("/board/remove")
public class Remove extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 로그인된 사용자의 아이디, 해당 글의 작성자 아이디가 일치
		Board board = Common.getThisContent(req);
		BoardService service = new BoardServiceImpl();
		int category = board.getCategory();
		List<Attach> attachs = service.remove(board.getBoardno());
		
		for(Attach attach : attachs) {
			File file = new File(req.getRealPath("upload") + File.separator + attach.getUploadPath() 
			+ File.separator + attach.getUuid());
			if(file.exists()) file.delete();
		}
		
		resp.sendRedirect("list?category="+category);
	}
}
