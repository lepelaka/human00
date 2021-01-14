package chap05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println("점수 총합 : " + sum);
		
		String[][] strs = {
			{"삼성전자", "현대자동차", "카카오"},
			{"셀트리온", "테슬라", "SK", "AMD"},
			{"LG", "amazon", "코카콜라", "펩시"}
		};
		
		for(String[] str :strs) {
			for(String s : str) {
				System.out.print(s + ",");
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < strs.length ; i++) {
			for(int j = 0 ; j < strs[i].length ; j++) {
				System.out.print(strs[i][j] + ",");
			}
			System.out.println();
		}
	}
}
