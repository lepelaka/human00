package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	public static void main(String[] args) {
		// Connection 타입을 리턴하는 메서드를 생성
		Connection conn = null;
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "student", "1234");
			
			// 구문 작성 객체 생성
			Statement stmt = conn.createStatement();
			
			
			/**
			 * 작성, 수정, 삭제
			 */
			stmt.executeUpdate(
//					"INSERT INTO STUDENT(STUDNO, NAME, GRADE) VALUES(30303, '홍길동', '1') "
					"DELETE FROM STUDENT WHERE STUDNO = 30303"
					);
			
			
			/**
			 * 조회 코드
			 */
			stmt = conn.createStatement();
			// 구문 작성 후 실행, 결과 집합 생성
			ResultSet rs = stmt.executeQuery("SELECT STUDNO, NAME, GRADE FROM STUDENT ORDER BY 1");
			
			// 결과 집합 탐색 후 로직 처리
			while(rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getInt("grade"));
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
