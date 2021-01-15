package js;

public class Ex15 {
	public static void main(String[] args) {
		// 회문수 인지 아닌지
		// 12321  123321
		// 12345 >> 54321
		// 12321 >> 12321
		
		// 12321
		int num = 12321;
		int copyNum = num;
		int result = 0;
		int tmp = 0;

		while(true) {
			result = num % 10; // 1
			num /= 10;
			
			tmp += result;
			if(num == 0) break;
			tmp *= 10;
		}
		
		System.out.println(copyNum == tmp ? "회문수" : "회문수아님");
		
		
		
		// 12321
		// 1 / 1232
		
		
		
		
	}
}
