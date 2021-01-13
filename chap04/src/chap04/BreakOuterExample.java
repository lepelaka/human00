package chap04;

public class BreakOuterExample {
	public static void main(String[] args) {
		// 구구단 작성
		outer:for(int i = 2 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if(i == 6) {
					break outer;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
