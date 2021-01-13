package chap04;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("글자 하나를 입력하세요");

		// 숫자 > 양수, 0
		// 영문 > 대문자, 소문자
		// 한글

		char input = scanner.nextLine().charAt(0);
		System.out.println(input);
		// 여기서부터가 코드
		if(input >= '0' && input <= '9') {
			System.out.print("숫자");
			
			if(input == '0') {
				System.out.print(" 0");
			}
			else {
				System.out.print(" 양수");
			}
		}
		else if(input >= 'A' && input <= 'Z'){
			System.out.print("영 대문자");
		}
		else if(input >= 'a' && input <= 'z'){
			System.out.print("영 소문자");
		}
		else if(input >= '가' && input <= '힣') {
			System.out.print("한글");
		}
		else {
			System.out.print("그 외의 입력");
		}
		
		System.out.println("입니다");

		// 출력문
		// 한글입니다
		// 영문 대문자입니다
		// 숫자 양수입니다
		// 영문입니다
		// 대문자입니다
		
		System.out.println((int)'ㄱ');
		// 44032 
	}
}
