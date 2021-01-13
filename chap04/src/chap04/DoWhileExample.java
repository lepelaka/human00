package chap04;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q키를 입력하세요");

		// ctrl + shift + o 
		Scanner scanner = new Scanner(System.in);
		String inputString = "";
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		scanner.close(); // scanner 객체가 사용중인 io 자원 반납
	}
}
