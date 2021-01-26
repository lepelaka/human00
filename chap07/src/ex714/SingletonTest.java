package ex714;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance(); // 객체 생성
		System.out.println(singleton);
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);
		
		singleton = null;
		System.out.println(singleton);
		System.out.println(singleton2);
	}
}

final class Singleton { // 디자인 패턴 리팩토링
	private static Singleton s = new Singleton(); // 클래스필드
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(s == null) s = new Singleton();
		return s;
	}
}
