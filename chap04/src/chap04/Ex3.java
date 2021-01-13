package chap04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		// 3번 Switch
		// 입력값을 받아서 (1~12사이의 숫자를 입력받으세요)

		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());

		switch (input) {
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		}
		// input에 따라서 봄, 여름, 가을, 겨울입니다를 출력하세요
		// 3,4,5 봄
		// 6,7,8 여름
		// 9,10,11 가을
		// 12,1,2 겨울

	}
}
