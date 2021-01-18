package chap06;

public class PriParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main().x : " + d.x);
		change(d.x);
		System.out.println("after change");
		System.out.println("main().x : " + d.x);
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change().x : " + x);
	}
}
