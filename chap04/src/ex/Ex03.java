package ex;

public class Ex03 {
	public static void main(String[] args) {
		// 3의 배수?
		// 3 6 9 12
		
		// ? % 3 == 0
		int sum = 0;
		for(int i = 0 ; i <= 100 ; i++) {
			if(i % 3 == 0) {
				sum += i ;
			}
		}
		System.out.println(sum);
	}
}
