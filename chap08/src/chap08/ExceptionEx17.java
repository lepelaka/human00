package chap08;

public class ExceptionEx17 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (MyException e) {
			System.out.println("main()에서 예외처리됨");
		}
	}
	
	static void m1 () throws MyException {
		try {
			throw new MyException("m1()에서 예외", 100);
		} catch (MyException e) {
			System.out.println("m1()에서 예외 처리됨");
			throw e;
		}
	}
}
