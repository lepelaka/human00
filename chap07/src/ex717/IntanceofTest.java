package ex717;

public class IntanceofTest {
	public static void main(String[] args) {
		Car fe = new Car(); // fe 타입 > Car, 인스턴스 FireEngine
		System.out.println(fe.getClass().getName()+"@"+String.format("%h", fe.hashCode()));
		System.out.println(fe);
		
		if(fe instanceof FireEngine) {
			System.out.println("FireEngine의 인스턴스");
		}
		if(fe instanceof Car) {
			System.out.println("Car의 인스턴스");
		}
		if(fe instanceof Object) {
			System.out.println("Object의 인스턴스");
		}
		if(fe instanceof Ambulance) {
			System.out.println("Ambulance의 인스턴스");
		}
	}
}

class Car{}
class FireEngine extends Car{}
class Ambulance extends Car{}
