package chap03;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1_000_000;
		int y = 1_000_000;
		
		long z = x * (long)y;
		System.out.println(z);
	}
	// 값에 대한 검증을 하는 메소드 >> validator
}
