package ex718_bind;

public class BindTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(a.i);
		System.out.println(A.si);
		a.m();
		A.sm();

		System.out.println(b.i);
		System.out.println(B.si);
		b.m();
		B.sm();
		
		System.out.println("----------------------------");
		
		a = b;
		
		System.out.println(a.i);
		System.out.println(A.si);
		a.m();
		A.sm();

		System.out.println(b.i);
		System.out.println(B.si);
		b.m();
		B.sm();
		
	}
}

class A {
	int i = 1;
	static int si = 2;
	
	void m() {
		System.out.println("A.m()");
	}
	static void sm() {
		System.out.println("A.sm()");
	}
}

class B extends A {
	int i = 3;
	static int si = 4;
	
	void m() {
		System.out.println("B.m()");
	}
	static void sm() {
		System.out.println("B.sm()");
	}
}