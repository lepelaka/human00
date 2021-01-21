package scenario.clothing;

public class ClothingService {
	// 조회하기 : Clothing타입이 배열을 받아와서 화면에 출력
	public void list(Clothing[] clothings) {
		String[] listInfo  = new String[] {
				"의류코드", "색상", "사이즈", "상하의", "원단", "계절"
		};
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println(ClothingUtils.getFormat(listInfo));
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		// 의류내용을 출력할수 있게 코드작성
		// hint 
		for(Clothing c : clothings) {
			System.out.println(ClothingUtils.getClothingInfo(c, true));
		}
		
		
	}
}
