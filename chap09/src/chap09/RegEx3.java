package chap09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
	public static void main(String[] args) {
//		String pattern = "0\\d{1,2}-\\d{3,4}-\\d{4}";
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("전화번호를 입력하세요 >> ");
//			String input = scanner.nextLine();
//			
//			if(input.matches(pattern)) {
//				System.out.println("유효한 전화번호입니다.");
//			}
//			else {
//				System.out.println("잘못된 전화번호입니다.");
//			}
//		}
		
		System.out.println(validate("1234@a.b"));
		System.out.println(validate("1234@1.b"));
		System.out.println(validate("abd@1"));
		System.out.println(validate("abd@a.ca"));
		System.out.println(validate("abd@naver.com"));
	}
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
	        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
	        return matcher.find();
	}
}
