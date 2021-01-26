package chap08;

public class ExceptionEx10 {
	public static void main(String[] args) throws Exception {
		Exception e = new Exception("던짐!!");
		throw e; // 발생
		
//		System.err.println("프로그램 정상종료");
		// Checked Exception : 처리 (try~catch), throws 사용
		
	}
}
