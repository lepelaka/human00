package chap04;

public class ForMultipulationTableExample {
	public static void main(String[] args) {
		for(int i = 2 ; i <= 9 ; i+=1) { //  8
			System.out.println("----" + i + "단 ---");
			for(int j = 1 ; j <= 9 ; j=j+1) { // 9
				System.out.println(i + " * " + j + " = " + i*j); // 72회
			}
		}
		
		// goto
		
		for(int i = 0 ; i < 72 ; i++) {
			int a = i / 9 + 2;
			int b = i % 9 + 1;
			System.out.println(a + "*" + b + "=" + a*b); 
		}
	}
}
