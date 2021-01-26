package rew02;

public class ConstTest {
	final int MIN_SPEED; // 인스턴스변수
	public ConstTest() {
		MIN_SPEED = 10;
	}
	
	public static void main(String[] args) {
		// 지역변수
		final int MAX_SPEED;
		
		int year = 2021;
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		int octal = 012; // 8진수
		int hexa = 0xA; // 16진수
		int dec = 10; // 10진수
		
		System.out.println(octal);
		System.out.println(hexa);
		
		System.out.printf("%o %h %d", 10, 10, 10);
		
		int bi = 0b1010;
		System.out.println(bi);
		// 1 >> mono
		// 2 >> du bi
		// 3 >> tri 
		// 4 >> quad
		// 5 >> penta
		// 6 >> hex
		
		// 7 >> sept
		// 8 >> oct
		// 9 >> nov
		// 10 >> dec
		
		// binary digit 2
		// octal number 8 
		// decimal 10
		// hexa-decimal 16
		
//		I II III IV V VI VII VIII IX X
		
	}
}
