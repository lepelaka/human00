package chap06;

public class CallStackTest {
	public static void main(String[] args) {
		System.out.println("main()시작");
		firstMethod();
		System.out.println("main()종료");
	}
	static void firstMethod() {
		System.out.println("firstMethod()시작");
		secondMethod();
		System.out.println("firstMethod()종료");
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
	
	// 자료구조 : 데이터를 어떻게 저장할 것인가
	// 스택, 큐
	// 큐(FIFO) : first in first out
	// 스택(LIFO) : last in first out
	
	
}
