package chap09;

public class StringEx {
	public static void main(String[] args) {
		String str = new String(new char[] {'자', '바', '맨'});
		System.out.println(str);
		
		// String 변경불가
		
		long start = System.currentTimeMillis(); //
		StringBuffer sb = new StringBuffer();
//		String s = "";
		for(int i = 0 ; i < 100_000 ; i++) {
//			s += "0";
			sb.append("0");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start + "ms");
		System.out.println(sb.length());
		String s = new String(sb);
		sb = new StringBuffer(s);
		// 확장개념
		// 빛의 속도? 
		
		// 0.125초
		// 125ms * 2 250ms
		
		
		
	}
}
