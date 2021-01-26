package ex7141;

public class CarTest {
	public static void main(String[] args) {
		FireEngine f = new FireEngine(); // 
		Ambulance a = new Ambulance();
//		a = (Ambulance)f;
//		f = (FireEngine)a;
		
		Car car = null; // 조상타입
		FireEngine fe = new FireEngine(); // 자손객체 = 자손인스턴스
		car = fe;
		fe.water();
		
		System.out.println(car); // fe
		System.out.println(fe);
		
//		Ambulance a1 = (Ambulance)car;// 조상, 자손
		
		((FireEngine)car).water();
		Car car2 = new Car();
		
		f = (FireEngine)car; // FireEngine
		f = (FireEngine)car2; // Car
		Object o = new Ambulance();
		Object o2 = new FireEngine();
		Object o3 = new Car();
	}
}
class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() {
		System.out.println("water!!!");
	}
}

class Ambulance extends Car { // 응급차
	void siren() {
		System.out.println("siren~~~");
	}
}