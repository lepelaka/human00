package chap06;

public class MarineTest {
	public static void main(String[] args) {
		
		Marine marine1 = new Marine();
		Marine marine2 = new Marine();
		Marine marine3, marine4;
		int a, b;
		System.out.println(marine1);
		System.out.println(marine2);
		
		marine1.hp -= 20; // 마린1 피격당함 20hp잃음
		System.out.println();
		System.out.println(marine1);
		System.out.println(marine2);
		
		Marine.weapon++; // 공1업
		System.out.println();
		System.out.println(marine1);
		System.out.println(marine2);
		return;
		
	}
}
