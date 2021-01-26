package chap08;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음"); // 예외 객체 생성 (Exception의 인스턴스)
			throw e; // 던짐
		} catch (Exception e) {
			System.err.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.err.println("프로그램 정상 종료됨");
	}
}
