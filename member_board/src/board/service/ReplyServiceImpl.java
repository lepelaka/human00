package board.service;

import java.util.List;

import board.dao.ReplyDao;
import board.vo.Reply;

public class ReplyServiceImpl implements ReplyService{
	private ReplyDao replyDao = new ReplyDao(); 
	// 댓글 작성
	public void write(Reply reply) {
		replyDao.write(reply);
	}
	// 댓글 수정
	public void modify(Reply reply) {
		replyDao.modify(reply);
	}
	// 댓글 삭제
	public void remove(int replyno) {
		replyDao.remove(replyno);
	}
	
	// 댓글 목록
	public List<Reply> list(int boardno){
		return replyDao.list(boardno);
	}
	
	// 댓글 하나 조회
	public Reply findBy(int replyno) {
		return replyDao.findBy(replyno);
	}
	
	
}
