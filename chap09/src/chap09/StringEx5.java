package chap09;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.StringJoiner;

public class StringEx5 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가"; //
		
		byte[] bArr = str.getBytes("utf-8");
		System.out.println(bArr.length);
		byte[] bArr2 = str.getBytes("cp949");
		System.out.println(bArr2.length);
		
		System.out.println("utf-8 : " + joinByteArr(bArr));
		System.out.println("cp949 : " + joinByteArr(bArr2));

		System.out.println("utf-8 : " + new String(bArr, "utf-8"));
		System.out.println("cp949 : " + new String(bArr2, "cp949"));
		
		
		System.out.println(URLDecoder.decode("%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC", "utf-8"));;
		System.out.println(URLEncoder.encode("가", "utf-8"));
		System.out.println(URLEncoder.encode("가", "cp949"));
	}
	
	static String joinByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		for(byte b : bArr) {
			sj.add(String.format("%02X", b));
		}
		return sj.toString();
	}
}

