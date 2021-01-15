package chap06;

public class TV {
	// 필드 (상태) >> 인스턴스 변수
	// 전원, 채널, 볼륨
	boolean power; // 초기화?
	int channel;
	int volumn;
	
	// 메서드 (기능)
	// 메서드 시그니쳐 : 메서드 이름, 파라미터 갯수, 파라미터 타입 
	// 전원, 채널업, 채널다운, 볼륨업, 볼륨다운
	
	// 함수
	// y = f(x);
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	void volumnUp() {
		volumn++;
	}
	void volumnDown() {
		volumn--;
	}
	int getVolumn() {
		return volumn;
	}
}
