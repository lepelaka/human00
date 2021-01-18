package chap06;

public class InitTest {
	static int counter;
	static int print() {
		counter++;
		System.out.println(counter);
		return counter;
	}
	public static void main(String[] args) throws Exception {
//		Class c = Class.forName("chap06.InitCompo"); // 클래스 로드(클래스 초기화)
//		System.out.println("InitCompo.si2 : " + InitCompo.si2); // 클래스 로드
		System.out.println("-----------------------");
		InitCompo ic = new InitCompo(); // 인스턴스 생성
		System.out.println("InitCompo.si2 : " + InitCompo.si2);
		
		System.out.println("-----------------------");
		InitCompo ic2 = new InitCompo(); // 인스턴스 생성
		System.out.println("-----------------------");
		InitCompo ic3 = new InitCompo(5, 6);
//		new InitCompo();
	}
}

class InitCompo {
	int i = InitTest.print();
	int i2;
	static int si2;
	static int si = InitTest.print(); // 1 명시적 초기화
	{
		System.out.println("초기화 블럭시작");
		i2 = InitTest.print(); // 4
		si2 = InitTest.print(); // 5
		System.out.println("초기화 블럭끝");
	}
	
	static {
		System.out.println("클래스 초기화 블럭시작");
		si2 = InitTest.print();
		System.out.println("클래스 초기화 블럭끝");
	}
	
	public InitCompo() {
		System.out.println("InitCompo()");
	}
	
	public InitCompo(int i, int i2) {
		this();
		this.i = i;
		this.i2 = i2;
		System.out.println("InitCompo(int i, int i2)");
	}
	// 클래스변수, 인스턴스변수, 지역변수(파라미터)
	// 클래스메서드, 인스턴스메서드 시점
	// 생성자
	// this
	// 시점 > 초기화
	
}
