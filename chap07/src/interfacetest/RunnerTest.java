package interfacetest;

public class RunnerTest {
	public static void main(String[] args) {
		Runner runner = new Runner();
		Runnable runner2 = new Runner();
		
		Runner.Runner2 runner3 = new Runner().new Runner2(); // ?
		Runner.Runner3 runner4 = new Runner.Runner3(); // ?
		
	}
}

interface Inter {
	interface Inter2 {
		
	}
}

class Runner implements Runnable { // 오버라이드 주의사항
	public void run() {
		System.out.println("run()~");
	}
	
	Runnable getRunner() {
		return new Runnable() {
			public void run() {
				
			}
		};
	}
	class Runner2 {
		
	}
	static class Runner3 {
		
	}
}

