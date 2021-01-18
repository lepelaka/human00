package chap06;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1() { // 메서드내에서 필드 접근
		System.out.println(cv);
//		System.out.println(iv);
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	static void staticMethod2() { // 메서드내에서 메서드 호출
		staticMethod1();
//		instanceMethod1();
		MemberCall mc = new MemberCall();
		mc.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
