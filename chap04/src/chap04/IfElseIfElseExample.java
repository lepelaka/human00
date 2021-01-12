package chap04;

import java.util.Random;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		String str = "";

		if (score >= 90) {
			str = "A";
		} 
		else if (score >= 80) {
			str = "B";
		} 
		else if (score >= 70) {
			str = "C";
		} 
		else {
			str = "D";
		}

		System.out.println("등급은 " + str + "입니다");
		
		
		// 프로그래밍에서 범위는 일반적으로 이상, 미만
		// 이상, 이하, 초과, 미만
		
		// 난수 생성
		// 0 이상 1 미만
		// 0.0 ~ 0.999999999999999
		//
//		System.out.println(Math.random());
		
		// 경우의 수 6
		
		// Math.random() * 6
		// 0.0 ~ 5.99999999999999 
		// + 1
		// 1 ~ 6.999999999999999
		// 1 ~ 6
		
		System.out.println((int)(Math.random() * 6 + 1));  
		
		
		
		
		
		
		
	}
}
