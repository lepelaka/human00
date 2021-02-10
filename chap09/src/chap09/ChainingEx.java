package chap09;

public class ChainingEx {
	public static void main(String[] args) {
		// chain + ing
		// 메서 호출 재호출
		System.out.println("가나다".concat("라마바사").concat("ABCD").concat("EDG") + "아");
		
		new Circle2(3).display().setR(5).display(); // chaining
		
		// $("img").attr("src", "images/머핀.png").attr("title", "이미지임").on("click", function() {
		// 
		
		StringBuffer sb = new StringBuffer("123");
		sb.append("45").append("67").append("abc");
		System.out.println(sb);
	}
}

class Circle2 {
	int r;
	Circle2() {}
	
	Circle2(int r) {
		this.r = r;
	}
	
	Circle2 setR(int r) {
		this.r = r;
		return this;
	}
	
	Circle2 getArea() {
		System.out.println(Math.PI * r * r);
		return this; 
	}
	
	Circle2 display() {
		System.out.print("반지름 : " + r + ", 넓이 : ");
		getArea();
		return this;
	}
}
