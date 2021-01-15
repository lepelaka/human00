package chap06;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 객체가 Student 인스턴스를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또다른 Student 인스턴스를 참조합니다.");
		
		System.out.println(s1); // 어떠한 주소값을 가지고있다.
		System.out.println(s2);
		
		System.out.println(new Student()); //
		
		new Student(); // Heap에 Student라는 형태를 가지는 인스턴스 생성
		
		int y;
		y = f(5);
		y = f(7);
		System.out.println(y);
	}
	
	static int f(int x) {
		return x*x;
	}
}
