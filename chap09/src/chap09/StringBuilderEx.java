package chap09;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer(); // thread safe
		StringBuilder builder = new StringBuilder("abcde"); // thread unsafe
		builder.append(10);
		
		// buffer, builder 동기화에 차이가 있다.
		
		// 멀티스레드시 동일 객체에 대한 데이터 차이가 발생 : 데이터 이상현상
		// 
		
		// ArrayList unsafe
		// Vector safe
		
		// 음수 최저값?
		int a = Integer.MIN_VALUE;
		System.out.println(-a);
		// 1 0000000 00000000 00000000 00000000
		// 0 1111111 11111111 11111111 11111111
		// 1 0000000 00000000 00000000 00000000
		// -128 ~ 127
		
		// 500_103_639_040 byte
		// 500_103_639 kb
		// 500_103 mb
		// 500 gb
		
		System.out.println(500_103_639_040L / 1024);
		System.out.println(488382460 / 1024);
		System.out.println(476935 / 1024);
		
		System.out.println((long)Math.pow(2, 20) * 1024);  // 제곱하기 2^30
		System.out.println(Math.sqrt(2)); // 1.414
		 // 제곱근 구하기
		
		// 4k
		// full HD
		
		// 4:3 >> 16:10 >> 16:9
		// 21:9
		
		
	}
}
