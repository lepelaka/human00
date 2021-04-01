package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import member.vo.Member;
import util.DBConn;

public class MemberDao {

	public void join(Member member) {
		Connection conn = DBConn.getConnection();
		try {
//			// 문장 작성
//			Statement stmt = conn.createStatement();
//			String sql = "INSERT INTO MEMBER(USERID, PASSWORD, NAME, EMAIL, BIRTHDATE) VALUES\r\n" + 
//					"(' " + member.getUserid() + " ', '" + member.getPassword() + ""
//							+ "', '" + member.getName() + "', '" + member.getEmail() + "', "
//									+ "TO_DATE('" + member.getBirthDate() + "', 'YYMMDD'))";
//			
//			// 작성 문장을 실행
//			stmt.executeUpdate(sql);
			
			// 전처리 문장을 선언
			String sql = "INSERT INTO MEMBER(USERID, PASSWORD, NAME, EMAIL, BIRTHDATE) VALUES\r\n" + 
					"(?, ?, ?, ?, TO_DATE(?, 'YYMMDD'))";
			
			// 전처리 문장 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			// 전처리 문장 파라미터 바인딩
			int idx = 1;
			pstmt.setString(idx++, member.getUserid());
			pstmt.setString(idx++, member.getPassword());
			pstmt.setString(idx++, member.getName());
			pstmt.setString(idx++, member.getEmail());
			pstmt.setString(idx++, member.getBirthDate());
			
			// 실행
			pstmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Member login(Member member) {
		Member result = null;
		Connection conn = DBConn.getConnection();
		String sql = "SELECT USERID, PASSWORD, NAME, EMAIL, TO_CHAR(BIRTHDATE, 'YYMMDD'), TO_CHAR(REGDATE, 'YYMMDD') "
				+ "FROM MEMBER WHERE USERID = ? AND PASSWORD = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getPassword());
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int idx = 1;
				result = new Member(
						rs.getString(idx++), 
						rs.getString(idx++),
						rs.getString(idx++),
						rs.getString(idx++),
						rs.getString(idx++),
						rs.getString(idx++)
						);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		Member member = new Member("il", "12345", null, null, null, null);
		System.out.println(new MemberDao().login(member));
	}
}
