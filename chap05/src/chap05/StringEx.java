package chap05;

public class StringEx {
	public static void main(String[] args) {
		String str1 = "둘리";
		String str2 = "둘리";
		String str3 = new String("둘리");
		String str4 = "도우너";
		System.out.println(str1.hashCode());
		System.out.println(str4.hashCode());
		
	}
}
