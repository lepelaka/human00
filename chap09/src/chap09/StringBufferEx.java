package chap09;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(15);
		System.out.println(sb.capacity());
		
	}
}
