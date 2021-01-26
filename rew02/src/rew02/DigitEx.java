package rew02;

public class DigitEx {
	public static void main(String[] args) {
		// 2진수 0 1 10       111 1000 1001 1010
		// 8진수 0 1  2         7   10   11   12
		
		// 1110010 >> 162[8] >> 72[16]
		
		int bit = 0b1110010;
		int oct = 0162;
		int hex = 0x72;

		System.out.println(bit);
		System.out.println(oct);
		System.out.println(hex);
		
		// AC[16] >>  10101100[2] >> 254[8]  
		
		// 88[10]
		// 1011000 
		
		// 0111
		// 1001 +
		// 0000
		System.out.println(0b1011000);
	}
}
