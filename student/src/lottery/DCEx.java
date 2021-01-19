package lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DCEx {
	public static void main(String[] args) {
//		DigitalConversion[] conversions = new DigitalConversion[23];
		List<DigitalConversion> conversions = new ArrayList<>(); // 크기지정 안해도됨
		conversions.add(new DigitalConversion(1, "강영훈"));
		conversions.add(new DigitalConversion(2, "강한슬"));
		conversions.add(new DigitalConversion(3, "구본희"));
		conversions.add(new DigitalConversion(4, "김기영"));
		conversions.add(new DigitalConversion(5, "김보경"));
		conversions.add(new DigitalConversion(6, "김소연"));
		conversions.add(new DigitalConversion(7, "노진주"));
		conversions.add(new DigitalConversion(8, "류슬희"));
		conversions.add(new DigitalConversion(9, "민지현"));
		conversions.add(new DigitalConversion(10, "박상훈"));
		conversions.add(new DigitalConversion(11, "박수연"));
		conversions.add(new DigitalConversion(12, "박재우"));
		conversions.add(new DigitalConversion(13, "신세영"));
		conversions.add(new DigitalConversion(14, "양수봉"));
		conversions.add(new DigitalConversion(15, "오승현"));
		conversions.add(new DigitalConversion(17, "이민성"));
		conversions.add(new DigitalConversion(18, "이상규"));
		conversions.add(new DigitalConversion(19, "이여름"));
		conversions.add(new DigitalConversion(20, "이찬희"));
		conversions.add(new DigitalConversion(21, "이혜영"));
		conversions.add(new DigitalConversion(22, "전민우"));
		conversions.add(new DigitalConversion(23, "정수인"));
		conversions.add(new DigitalConversion(25, "지연우"));
		
		
		Collections.shuffle(conversions);
		
		List<DigitalConversion> result = conversions.subList(0, 2); 
		System.out.println(result);
		
		// 15 : 오승현
		// 6 : 김소연
		// 8 : 류슬희
		// 14 : 양수봉
		
		// 13 : 신세영
		// 1 : 강영훈
		
		// 2 : 강한슬
		// 18 : 이상규
		
		// 19 : 이여름x
		// 13 : 신세영 
	}
}
