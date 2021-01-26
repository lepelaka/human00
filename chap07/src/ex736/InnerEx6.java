package ex736;

public class InnerEx6 {
	// 익명클래스 : 객체 생성
	Object iv = new Object() { // 인스턴스변수
		public void method() {
			System.out.println("iv");
		}
	};
	
	static Object cv = new Object() {
		void method() {
			
		}
	};
	
	void myMethod() {
		Object lv = new Object() {
			void method() {
				
			}
		};
	}
	
	public static void main(String[] args) {
		InnerEx6 ie6 = new InnerEx6();
		System.out.println(ie6.iv);
	}
}
