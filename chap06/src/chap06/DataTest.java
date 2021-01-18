package chap06;

public class DataTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();// 에러발생 why
		
		// 생성자가 아무것도 없는 클래스에만 기본생성자가 자동으로 생성
	}
}

class Data1 {
	int x;
	// 생성자 없음
	public Data1() {
		
	}
}

class Data2 {
	int x;
	// 생성자 있음
	public Data2() {
	}
	public Data2(int input) {
		x = input;
	}
}
