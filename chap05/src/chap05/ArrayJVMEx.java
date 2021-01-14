package chap05;

import java.util.Arrays;

public class ArrayJVMEx {
	public static void main(String[] args) {
		int[] scores; 
		scores = new int[]{70, 80, 90};
		

		int[] scores2 = scores;
		System.out.println("scores : " + Arrays.toString(scores));
		System.out.println("scores2 : " + Arrays.toString(scores2));
		
		scores2[1] = 100;
		System.out.println("scores : " + Arrays.toString(scores));
		System.out.println("scores2 : " + Arrays.toString(scores2));
		
		System.out.println(args.length);
		
	}
}
