package ex712;

public class FinalCardTest {
	public static void main(String[] args) {
		// final : 한번 정하면 변경 불가
		final int i; // 선언
		i = 10;
		
		Card c = new Card("HEART", 10);
//		c.NUMBER = 5;
//		c.KIND = "SPADE";
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}

class Card {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	public Card(String KIND, int NUMBER) {
		this.KIND = KIND;
		this.NUMBER = NUMBER;
	}

	public Card() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
	
}
