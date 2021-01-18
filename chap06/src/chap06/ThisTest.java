package chap06;

public class ThisTest {
	public static void main(String[] args) {
		// this : 이거
		// 통화시 1인칭을 3인칭화 >> 나
		// 미래에 생성될 객체의 주소값
		
		ThisCompo tc = new ThisCompo(); // chap06.ThisCompo@7852e922
		tc.printThis(); // << chap06.ThisCompo@7852e922
		System.out.println(tc); // << chap06.ThisCompo@7852e922
		
//		ThisCompo tc2 = tc.getThis(); // chap06.ThisCompo@7852e922
		ThisCompo tc2 = tc;
		tc2.printThis(); // <<
		System.out.println(tc2); // <<
		
		
		// 클래스 설계 >> 객체 생성
		// 1. 클래스 단계 : 객체가 언제 생성될지 모름
		// 2. 객체 단계 : 객체가 생성 완료(주소값을 가짐)
		
	}
}

class ThisCompo {
	
	ThisCompo getThis() { // method
		return this;
	}
	
	void printThis() {
		System.out.println(this); // 
	}
	
	static void print() {
//		System.out.println(this);
	}
}