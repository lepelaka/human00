package ex712;

import java.util.Arrays;

public class RefTypeFinalEx {
	public static void main(String[] args) {
		final int[] arr = {10, 20, 30}; 
		// 어떻게 될까 >> 주소 변경 불가
		arr[0] = 50;
		arr[0] = 30;
//		arr = new int[5];
//		arr = null;
		System.out.println(Arrays.toString(arr));
		final int i = 10;
	}
}
