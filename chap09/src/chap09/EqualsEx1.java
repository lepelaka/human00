package chap09;

public class EqualsEx1 {
	public static void main(String[] args) {
		Object o = new Object();
		
		Value v1 = new Value(3);
		Value v2 = new Value(3);
		
		System.out.println(v1 == v2); // 주소값
		v1.equals(null); // false
		v1.equals(o); // false
		v1.equals(new Value(4));
		System.out.println(v1.equals(v2)); // 메서드를 통한 비교
	}
}

class Value extends Object{
	int value;
	
	Value(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof Value && this.value == ((Value)obj).value;
	}
	
	
}
