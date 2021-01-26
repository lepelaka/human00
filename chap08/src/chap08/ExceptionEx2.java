package chap08;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			try {
				result = number / (int)(Math.random() * 10); // (0~9)
			}
			catch (ArithmeticException e) {
				result = 0;
			}
			System.out.println(result);
		}
			
	} 
}
