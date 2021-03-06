package chap03;

public class BitLogicExam {
	public static void main(String[] args) {
		int a = 9; // 1001
		int b = 3; // 0011
		
		//            0001
		//            1011 == 11
		//            1010 == 10
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b); // eXclusive OR
		
		System.out.println("-------------- 절취선 ---------------");
		for(int i = 0 ; i < 28 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(~a));
		System.out.println(~a);
		
		
		System.out.println("-------------- 절취선 ---------------");
		for(int i = 0 ; i < 21 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(1024));
		for(int i = 0 ; i < 19 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(1024 << 2));
		for(int i = 0 ; i < 23 ; i++) {
			System.out.print(0);
		}
		System.out.println(Integer.toBinaryString(1024 >> 2));
		
		
		System.out.println("-------------- 절취선 ---------------");
		System.out.println(Integer.toBinaryString(-1024));
		System.out.println(Integer.toBinaryString(-1024 << 2));
		System.out.println(Integer.toBinaryString(-1024 >> 2));
		System.out.println("00"+Integer.toBinaryString(-1024 >>> 2));
		
		System.out.println(-1024 >> 2);
		System.out.println(-1024 >>> 2);
		
		
	}
}
