package chap04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		// 4번문제 
		// 가위 바위 보 게임만들기
		
		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int user = Integer.parseInt(scanner.nextLine());
		int com = (int)(Math.random() * 3) + 1;
		
		// switch를 이용해 코드 작성
		
		System.out.println("당신은 " + user + "를 냈습니다.");
		System.out.println("컴퓨터는 " + com + "를 냈습니다.");
		
		
		// 당신이 이겼습니다.
		
		// 당신이 졌습니다
		
		// 비겼습니다.
	}
}
