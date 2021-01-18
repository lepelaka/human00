package js;

import java.util.Arrays;

public class Ex8 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		
//		System.out.println(answer[0]); 
		
		for (int i = 0; i < answer.length; i++) { // answer 반복순회
			/* (1) 알맞은 코드를 넣어 완성하시오. */
			counter[answer[i]-1]++;
		}
		for (int i = 0; i < counter.length; i++) { // counter
			System.out.print(counter[i]);
			for(int j = 0 ; j < counter[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(counter));
	}
}
