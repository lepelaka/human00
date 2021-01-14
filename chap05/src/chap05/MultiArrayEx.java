package chap05;

public class MultiArrayEx {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		
		
		int[][] arr2 = {{10, 20}, {30, 40, 50}};
		
		// arr2.length = 2
		// arr2[0].length = 2
		// arr2[1].length = 3
		
		int[][] arr3 = new int[2][];
		arr3[0] = new int[3];
		arr3[1] = new int[2];
		
	}
}
