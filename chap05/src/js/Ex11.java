package js;

public class Ex11 {
	public static void main(String[] args) {
		int[][] score = { 
				{ 100, 100, 100, 50 }, 
				{ 20, 20, 20, 50 }, 
				{ 30, 30, 30, 50 }, 
				{ 40, 40, 40, 50 }, 
				{ 50, 50, 50, 50 } };
		
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j]; // 행 합산
				result[score.length][j] += score[i][j]; // 열 합산
				result[score.length][score[i].length] += score[i][j]; // 행렬합산
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	} // main
}