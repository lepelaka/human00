package ex71;

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv(); // Heap
		ctv.power();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World!!!");
		
		Tv tv = new Tv();
	}
}

class Tv { // 부모
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv { // 자식
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
