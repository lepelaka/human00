package js;

public class Ex3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50}; // 5개 0, 1, 2, 3, 4
		int sum = 0;
		
		/*
		 * 
		 */
//		for(int i = 10 ; i <= 50 ; i+= 10) {
//			sum += i;
//		}
		
//		for(int i = 0 ; i < arr.length ; i++) {
//			sum += arr[i];
//		}
		
		sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4];
		
		System.out.println(sum);
	}
}
