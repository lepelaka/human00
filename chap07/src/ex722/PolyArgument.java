package ex722;

public class PolyArgument {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
}

abstract class Product {
	int price;
	int bonusPoint;
	public Product() {}
	public Product(int price) {
		this.price = price;
		this.bonusPoint = price/10;
	}
}
class Tv extends Product {
	public Tv() {
		super(100);
	}
	public String toString() {
		return "tv";
	}
}
class Computer extends Product {
	public Computer() {
		super(200);
	}
	public String toString() {
		return "computer";
	}
}
class Audio extends Product {
	public Audio() {
		super(50);
	}
	public String toString() {
		return "audio";
	}
}
class Buyer {
	int money = 1000;
	int bonusPoint;
	Product[] item = new Product[10];
	int i;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0 ; i < item.length ; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입물품의 총액은 " + sum + "만원입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
	
}

