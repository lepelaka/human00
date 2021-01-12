package chap03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = '!';
		
		if(charCode >= 65 & charCode <=90) {
			System.out.println("대문자 이군요");
		}
		if(charCode >= 'a' && charCode <= 'z') {
			System.out.println("소문자 이군요");
		}
		if(charCode >= '0' && charCode <='9') {
			System.out.println("숫자 이군요");
		}
		
		int value = 11;
		
		if(value % 2 == 0 | value % 3 == 0) {
			System.out.println("2또는 3의 배수 이군요");
		}
		
		if(value % 2 == 0 || value % 3 == 0) {
			System.out.println("2또는 3의 배수 이군요");
		}
		
	}
}
