package app;

import java.util.ArrayList;
import java.util.List;

import vo.AbstractLocationVo;

public class BpEx {
	public static void main(String[] args) {
		// 다형성
		
		List<AbstractLocationVo> locations = new ArrayList<>();
		locations.add(AbstractLocationVo.getInstance("event", "시작점"));
		locations.add(AbstractLocationVo.getInstance("city", "서울"));
		locations.add(AbstractLocationVo.getInstance("city", "대전"));
		locations.add(AbstractLocationVo.getInstance("city", "대구"));
		locations.add(AbstractLocationVo.getInstance("city", "부산"));
		locations.add(AbstractLocationVo.getInstance("event", "황금열쇠"));
		locations.add(AbstractLocationVo.getInstance("city", "울산"));
		locations.add(AbstractLocationVo.getInstance("city", "마산"));
		locations.add(AbstractLocationVo.getInstance("city", "경산"));
		locations.add(AbstractLocationVo.getInstance("city", "익산"));
		
		// city 인스턴스
		System.out.println(locations);
		
		// event 
		// 국세청 : 벌금 납부
		// 황금열쇠 : 
		// 무인도 
		// 비행기
		// 보너스게임 
		// 시작점
		
		
		
	}
}
