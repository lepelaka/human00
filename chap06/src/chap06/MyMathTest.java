package chap06;

// 복수개의 클래스나 메서드가 있는 예제를 타이핑하는 법
// 실행 클래스(메인메서드를 포함하고있는)로 파일 이름을 작성
// 메인메세드는 외부의 API를 실행을 하기때문에
// 외부 클래스, 메서드부터 작성 후 메인의 내용 채우기

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5, 3);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // Long literal
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println(mm.diff(6, 10));
	}
}
class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) { return a / b; }
	
	int diff(int a, int b) {
		return abs(a - b);
	}
	int abs(int x) {
		return x >= 0 ? x : -x; 
	}
}
