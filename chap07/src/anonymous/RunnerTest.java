package anonymous;
// 학생
// 도서


public class RunnerTest {
	public static void main(String[] args) {
		Runnable runner1 = new Runner();
		runner1.run();
		
		Runnable runner2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("runner2.run()");
			}
		};
		
		runner2.run();
		// 추상클래스, 인터페이스 : 추상메서드를 소유
		
		Runnable runner3 = new Runner().getRunner();
		runner3.run();
		
		AbsClass ab = new AbsClass() {};
	}
}
// 컴파일 언어

// 인터프리트 언어 javascript, php 
interface Runnable {
	void run();
}
abstract class AbsClass {
	
}
class Runner implements Runnable {
	public void run() {
		System.out.println("Runner.run()");
	}
	
	public Runnable getRunner() {
		return new Runnable() {
			@Override
			public void run() {
				System.out.println("getRunner().run()");
			}
		};
	}
}
