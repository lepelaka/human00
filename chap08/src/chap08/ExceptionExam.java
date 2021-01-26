package chap08;

public class ExceptionExam {
	public static void main(String[] args) { // 인스턴스 메서드, 클래스 메서드?
		// 클래스 메서드 몸통부에서 다른 메서드를 호출 클래스 메서드
		System.out.println("main()의 시작");
		m1();
		System.out.println("main()의 종료");
//		new ExceptionExam().wait();
	}
	static void m1() {
		System.out.println("m1()의 시작");
		try {
			m2();
		}
		catch (Exception e) {
			System.out.println("m1()에서 예외 처리시킴");
		}
		System.out.println("m1()의 종료");
	}
	
	static void m2() throws Exception {
		System.out.println("m2()의 시작");
		m3();
		System.out.println("m2()의 종료");
	}
	
	static void m3() throws Exception{
		System.out.println("m3()의 시작");
//		try {
		throw new Exception("런타임 예외 발생 시킴 ㅋ"); // 예외 발생
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("m3()의 종료");
	}
}
