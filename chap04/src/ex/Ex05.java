package ex;

public class Ex05 {
	public static void main(String[] args) {
		// 4x + 5y = 60
		
		for(int i = 1 ; i <= 10 ; i++) { // x 10 // 42억
			for(int j = 1 ; j <= 10 ; j++) { // x 10 // 42억
				// 100
				if(i * 4 + j * 5 == 60) {
					System.out.println(i+","+j);
				}
			}
		}
		
	}
}
