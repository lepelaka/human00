package chap06;

public class TvArrEx {
	public static void main(String[] args) {
//		TV tv = new TV();
		TV[] tvs = new TV[3];
//		TV tv = null;
		
		for(int i = 0 ; i < tvs.length ; i++) {
			tvs[i] = new TV(); // 각각의 TV객체 생성
			tvs[i].channel = i+10; // 각각의 tvs[i]의 채널값을 i+10 (10, 11, 12) 지정
		}
		
		for(TV tv :tvs) { // 향상 for
			System.out.println(tv.channel); // 조회
		}
		
		// 학생 성적 예제
		// 학생 객체 배열
		
		int[] arr = {10, 20, 30, 40, 50};
		
		TV[] tvArr = {null, null, new TV()};
	}
}
