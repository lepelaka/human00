package chap08;

public class MyExceptionEx {
	public static void main(String[] args) {
		try {
			m1();
		}
		catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}
	}
	
	static void m1() throws MyException{
		m2();
	}
	static void m2() throws MyException{
		throw new MyException("내가만든 예외", 300);
	}
}
