package chap06;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car(); // 
		Car c2 = new Car("blue");
		Car c3 = new Car("red", "manual", 2);
		Car c4 = new Car(c1); // 객체 복제
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}

class Car {
	String color; // null
	String gearType; // null
	int door; // 0 인스턴스 변수
	{
		// 인스턴스변수 초기화
	}
	
	static {
		// 클래스변수 초기화
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
		}
	}
	Car() { // 기본생성자
		// 추가 할일
		this("white"); // << 여기를 책이랑 다르게했음 다른 생성자 호출
	}
	Car(String color) {
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) { // << ★★★★★
		this.color = color; // 회색 : 파라미터(지역변수), 청색 : 인스턴스변수
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c) {
//		this.color = c.color;
//		gearType = c.gearType;
//		door = c.door;
		this(c.color, c.gearType, c.door);
	}
	@Override // alt + s, s >> enter (generate toString)
	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	
	void method() {
		// 프로그래밍에서 무엇인가를 참조하려고 할때 가까운것을 먼저 찾는다.
		String door = "10"; 
		System.out.println(door);
		System.out.println(this.door);
	}
	
}
