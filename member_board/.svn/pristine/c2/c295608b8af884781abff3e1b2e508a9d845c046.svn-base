package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import board.vo.Attach;
import board.vo.Board;
import util.DBConn;

public class BoardDao {
	public void write(Board board) {
		Connection conn = DBConn.getConnection();
		try {
			conn.setAutoCommit(false);
			
			// 전처리 문장을 선언
			String sql = "INSERT INTO BOARD(BOARDNO, TITLE, CONTENT, USERID, PARENTNO, CATEGORY)\r\n" + 
					"VALUES (SEQ_BOARD.NEXTVAL, ?, ?, ?, ?, ?)";
			
			// 전처리 문장 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);

			// u1의 친구 u2
			// u1 u3
			// u1 u4
			
			// u1 u2, u4, u3
			
			// 전처리 문장 파라미터 바인딩
			int idx = 1;
			pstmt.setString(idx++, board.getTitle());
			pstmt.setString(idx++, board.getContent());
			pstmt.setString(idx++, board.getUserid());
			pstmt.setObject(idx++, board.getParentno());
			pstmt.setInt(idx++, board.getCategory());
			
			
			// 실행
			pstmt.executeUpdate();
			
			List<Attach> attachs = board.getAttachs();
			if(attachs.size() == 0) {
				conn.commit();
				return;
			}
			
			// 마지막 작성글의 글번호 조회
			sql = "SELECT MAX(BOARDNO) FROM BOARD";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int boardno = rs.getInt(1);
			
			// 첨부파일 테이블에 attachs 만큼을 insert
			sql = "INSERT INTO ATTACH(UUID, UPLOADPATH, FILENAME, FILETYPE, FILEORDER, BOARDNO) \r\n" + 
					"VALUES (?, ?, ?, ?, ?, ?)";
			for(Attach attach : attachs) {
				pstmt = conn.prepareStatement(sql);
				idx = 1;
				pstmt.setString(idx++, attach.getUuid());
				pstmt.setString(idx++, attach.getUploadPath());
				pstmt.setString(idx++, attach.getFileName());
				pstmt.setBoolean(idx++, attach.isImage());
				pstmt.setInt(idx++, attach.getFileOrder());
				pstmt.setInt(idx++, boardno);

				// 실행
				pstmt.executeUpdate();
			}
			conn.commit();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
//		Board board = new Board("자바에서 쓴 글 제목", "자바에서 쓴 글 내용", "javaman", 1, 1);
//		dao.write(board);
		
		System.out.println("====== 목록 조회 ======");
		dao.list(1).forEach(System.out::println);
//		
//		
//		System.out.println("====== 상세 조회 ======");
//		System.out.println(dao.findBy(1));
//		System.out.println(dao.findBy(3));
//		
//		System.out.println("====== 수정 후 확인 ====== ");
//		dao.modify(new Board(2, "자바에서 수정된 글 제목", "내용내용"));
//		System.out.println(dao.findBy(2));
//		
//		System.out.println("====== 삭제 후 반영 행의 갯수 확인 ====== ");
//		System.out.println(dao.remove(3));
//		System.out.println(dao.remove(4));
//		
//		System.out.println("====== 목록 조회 ======");
//		dao.list(1).forEach(System.out::println);
		
	}
	public List<Board> list(Integer category) {
		return list(category, false);
	}
	
	public List<Board> list(Integer category, boolean notice) {
		List<Board> result = null;
		Connection conn = DBConn.getConnection();
		String sql = "SELECT BOARDNO, TITLE, CONTENT, USERID, \r\n" + 
				"CASE\r\n" + 
				"    WHEN SYSDATE - REGDATE < 1 THEN TO_CHAR(REGDATE, 'HH24:MI:SS')\r\n" + 
				"    ELSE TO_CHAR(REGDATE, 'YY/MM/DD')\r\n" + 
				"END REGDATE,\r\n" + 
				"HITCOUNT, PARENTNO, CATEGORY, (SELECT NAME FROM MEMBER M WHERE M.USERID = B.USERID) USERNAME \r\n" + 
				"FROM BOARD B\r\n" + 
				"WHERE CATEGORY = ? AND BOARDNO > 0\r\n";
				if(notice) {
					sql += "AND ROWNUM < 4\r\n"; 
				}
				sql += "ORDER BY 1 DESC";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, category);
			
			ResultSet rs = pstmt.executeQuery();
			result = new ArrayList<Board>();
			while(rs.next()) {
				int idx = 1;
				Board board = new Board();
				board.setBoardno(rs.getInt(idx++));
				board.setTitle(rs.getString(idx++));
				board.setContent(rs.getString(idx++));
				board.setUserid(rs.getString(idx++));
				board.setRegdate(rs.getString(idx++));
				board.setHitcount(rs.getInt(idx++));
				board.setParentno(rs.getInt(idx++));
				board.setCategory(rs.getInt(idx++));
				board.setUsername(rs.getString(idx++));
				
				result.add(board);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Board findBy(Integer boardno) {
		Board result = null;
		Connection conn = DBConn.getConnection();
		String sql = "SELECT BOARDNO, TITLE, CONTENT, USERID, REGDATE, HITCOUNT, PARENTNO, CATEGORY, (SELECT NAME FROM MEMBER M WHERE M.USERID = B.USERID) USERNAME\r\n" + 
				"FROM BOARD B\r\n" + 
				"WHERE BOARDNO = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardno);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int idx = 1;
				
				result = new Board();
				
				result.setBoardno(rs.getInt(idx++));
				result.setTitle(rs.getString(idx++));
				result.setContent(rs.getString(idx++));
				result.setUserid(rs.getString(idx++));
				result.setRegdate(rs.getString(idx++));
				result.setHitcount(rs.getInt(idx++));
				result.setParentno(rs.getInt(idx++));
				result.setCategory(rs.getInt(idx++));
				result.setUsername(rs.getString(idx++));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void modify(Board board) {
		Connection conn = DBConn.getConnection();
		try {
			// 전처리 문장을 선언
			String sql = "UPDATE BOARD SET\r\n" + 
					"    TITLE = ?,\r\n" + 
					"    CONTENT = ?,\r\n" + 
					"    REGDATE = SYSDATE\r\n" + 
					"WHERE BOARDNO = ?";
			
			// 전처리 문장 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 전처리 문장 파라미터 바인딩
			int idx = 1;
			pstmt.setString(idx++, board.getTitle());
			pstmt.setString(idx++, board.getContent());
			pstmt.setInt(idx++, board.getBoardno());
			
			// 실행
			pstmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public int remove(Integer boardno) {
		Connection conn = DBConn.getConnection();
		int ret = 0;
		try {
			conn.setAutoCommit(false);
			// 첨부파일 테이블에서의 삭제
			String sql = "DELETE ATTACH WHERE BOARDNO = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 전처리 문장 파라미터 바인딩
			int idx = 1;
			pstmt.setInt(idx++, boardno);
			
			// 실행
			pstmt.executeUpdate();
			pstmt.close();
			
			// 게시판에서의 삭제
			// 전처리 문장을 선언
			sql = "DELETE BOARD WHERE BOARDNO = ?";
			
			// 전처리 문장 생성
			pstmt = conn.prepareStatement(sql);
			
			// 전처리 문장 파라미터 바인딩
			idx = 1;
			pstmt.setInt(idx++, boardno);
			
			
			// 실행
			ret = pstmt.executeUpdate();
			conn.commit();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
		
	}

	// 게시글 번호를 이용한 첨부파일 목록 가져오기
	public List<Attach> getAttachs(Integer boardno) {
		List<Attach> result = null;
		Connection conn = DBConn.getConnection();
		String sql = "SELECT UUID, UPLOADPATH, FILENAME, FILETYPE, FILEORDER, BOARDNO \r\n" + 
				"FROM ATTACH\r\n" + 
				"WHERE BOARDNO = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardno);
			
			ResultSet rs = pstmt.executeQuery();
			result = new ArrayList<Attach>();
			while(rs.next()) {
				int idx = 1;
				Attach attach = new Attach();
				attach.setUuid(rs.getString(idx++));
				attach.setUploadPath(rs.getString(idx++));
				attach.setFileName(rs.getString(idx++));
				attach.setImage(rs.getBoolean(idx++));
				attach.setFileOrder(rs.getInt(idx++));
				attach.setBoardno(rs.getInt(idx++));
				result.add(attach);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
