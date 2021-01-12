package chap02;

public class CastingExample {
	public static void main(String[] args) {
//		int intValue = 44032;
//		char charValue = (char) intValue;
//		System.out.println(charValue);
//
//		long longValue = 500;
//		intValue = (int) longValue;
//		System.out.println(intValue);
//		
//		double doubleValue = 3.14;
//		intValue = (int)doubleValue;
//		System.out.println(intValue);
			
		// byte, short, int, long, char, float, double, boolean
		
		// 
		System.out.println("------------- 정수 -------------");
		System.out.println(Byte.MAX_VALUE); 
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		System.out.println(Byte.MIN_VALUE); 
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println("------------- 실수 -------------");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
}
