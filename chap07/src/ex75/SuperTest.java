package ex75;

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child(); // child instance 생성
		c.method();
		GrandChild gc = new GrandChild();
		gc.method();
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	void method() { // 
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x);
	}
}

class GrandChild extends Child {
	int x = 30;
}
