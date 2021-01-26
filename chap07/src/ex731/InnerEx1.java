package ex731;

public class InnerEx1 {
	class InstanceInner { 
		int iv = 100;
//		static int cv = 100;
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod(int i) {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		
		InnerEx1 ie = new InnerEx1();
		InnerEx1.InstanceInner ii = ie.new InstanceInner();
		InnerEx1.StaticInner si = new StaticInner();
	}
}
