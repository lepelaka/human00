package chap06;

public class TvEx {
	public static void main(String[] args) {
		TV tv1 = new TV(); // 객체 생성
		TV tv2 = new TV();
		
		// 필드의 값 확인
		System.out.println("tv1의 전원 : " + tv1.power);
		System.out.println("tv1의 채널 : " + tv1.channel);
		System.out.println("tv1의 볼륨 : " + tv1.volumn);

		System.out.println("tv2의 전원 : " + tv2.power);
		System.out.println("tv2의 채널 : " + tv2.channel);
		System.out.println("tv2의 볼륨 : " + tv2.volumn);
		
		// 메서드 호출
		tv1.power();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.volumnUp();
		tv1.volumnUp();
		
		tv2.power = true;
		tv2.channel = 10;
		tv2.volumn = 15;
		
		System.out.println();
		// 필드의 값 확인
		System.out.println("tv1의 전원 : " + tv1.power);
		System.out.println("tv1의 채널 : " + tv1.channel);
		System.out.println("tv1의 볼륨 : " + tv1.volumn);

		System.out.println("tv2의 전원 : " + tv2.power);
		System.out.println("tv2의 채널 : " + tv2.channel);
		System.out.println("tv2의 볼륨 : " + tv2.volumn);
		
	}
}
