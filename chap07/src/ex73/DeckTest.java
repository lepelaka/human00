package ex73;

import java.util.Arrays;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck(); // 
		Card c = d.pick();
		System.out.println(Arrays.toString(d.cardArr));
		System.out.println(c);
		
		
		d.shuffle();
		System.out.println(Arrays.toString(d.cardArr));
		c = d.pick(0); // 
		System.out.println(c);
		
		System.out.println(c.equals(d));
		Card c1 = d.pick();
		System.out.println(c1.equals(c));
		Card c2 = c;
		System.out.println(c2.equals(c)); // c2 == c
	}
}

class Deck {
	final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM]; // 52 0~51
	public Deck() {
		int i = 0;
		for(int k=Card.KIND_MAX ; k > 0 ; k--) { // 4
			for(int n = 0; n < Card.NUM_MAX ; n++) { // 13
				cardArr[i++] = new Card(k, n+1); // 13*4
			}
		}
		// (4, 1)(4, 2) ~ (1, 12)(1, 13) 
	}
	Card pick(int idx) {
		return cardArr[idx];
	}
	Card pick() {
		int idx = (int)(Math.random() * CARD_NUM);
		return pick(idx);
	}
	void shuffle() {
		for(int i = 0 ; i < cardArr.length ; i++) { // 52
			int r = (int)(Math.random() * CARD_NUM); // 
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}

	public Card(int kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number); 
	}
	
	
}
