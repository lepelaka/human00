package chap09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i = 100; // 100 숫자
		Integer i2 = new Integer(100);
		
		System.out.println("i==i2 : " + (i==i2)); // 주소 비교
		System.out.println("i.equals(i2) : " + i.equals(i2));
		System.out.println("i.compareTo(i2) : " + i.compareTo(i2));
		System.out.println("i.toString() : " + i.toString());
		
		System.out.println("MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("SIZE=" + Integer.SIZE + "bits");
		System.out.println("BYTES=" + Integer.BYTES + "BYTES");
		System.out.println("TYPE="+Integer.TYPE);
		
		// 래퍼 > 문자열  toString()
		// 기본형 > 문자열 +""
		
		// 문자열 > 래퍼 .valueOf()
		// 문자열 > 기본형 .parseXXX()
		
		// 기본형 > 래퍼
		// 래퍼 > 기본형
		
		System.out.println(i + i2);
		
		Integer[] arr = {5, 4, 6, 8, 10, 2, 1};
		int[] arr2 = {5, 4, 6, 8, 10, 2, 1}; //
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		List<Integer> list;
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
