package chap04;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i = 1 ; i <= 100 ; i++) {
			sum += i; // sum = sum+i
			System.out.println("i : " + i);
			System.out.println("sum : " + sum);
			System.out.println("------ for " + i +"번 종료");
		}
		// 0 + 1 = sum
		// 1번루프 : sum : 1 i : 1
		// 2번루프 : i = 2, sum = 3
		// 3번루프 : i = 3, sum = 6
		System.out.println("1~" + (i-1) + "의합 : " + sum);
		
		
	}
}
