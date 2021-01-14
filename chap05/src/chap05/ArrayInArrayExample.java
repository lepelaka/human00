package chap05;

import java.util.Arrays;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // 행렬 6개의 int자리가 생성

		for(int i = 0 ; i < mathScores.length ; i++) { // 2
			for(int j = 0 ; j < mathScores[i].length ; j++) {
				System.out.println("mathScores["+i+"]["+j+"] : " + mathScores[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i = 0 ; i < englishScores.length ; i++) { // 2
			for(int j = 0 ; j < englishScores[i].length ; j++) { // 0 : 2, 1 : 3
				System.out.println("englishScores["+i+"]["+j+"] : " + englishScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = {{95,80}, {92,96,80}};
		
		for(int i = 0 ; i < javaScores.length ; i++) { // 2
			System.out.println(Arrays.toString(javaScores[i]));
			for(int j = 0 ; j < javaScores[i].length ; j++) { // 0 : 2, 1 : 3
				System.out.println("javaScores["+i+"]["+j+"] : " + javaScores[i][j]);
			}
		}
		
		
		
	}
}
