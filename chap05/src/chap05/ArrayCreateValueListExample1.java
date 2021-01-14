package chap05;

public class ArrayCreateValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87}; // 값을 통한 초기화
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0 ; i < 3 ; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/3.0);
		
		// 선언, 할당
		int a;
		a = 10;
		
		int b = 10;
		
		int[] scores2;
		scores2 = new int[]{10,20,30};
		int[] scores3 = new int[]{10,20,30};
		
	}
}
