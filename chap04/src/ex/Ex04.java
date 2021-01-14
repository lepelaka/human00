package ex;

public class Ex04 {
	public static void main(String[] args) {
		// 작성 위치
		
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			System.out.println(dice1 + ", " + dice2);
			if(dice1+dice2 == 5) {
				break;
			}
		}
		
		
	}
}
