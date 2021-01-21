package scenario.clothing;

public class ClothingEx {
	public static void main(String[] args) {
		// 9문항
		// 1-1. 의류 : 코드(정수), 색상(문자열?), 사이즈(문자열), 
		// 상하의(불린), 원단(문자열), 계절(문자열)로 필드를 생성하세요
		// 1-2. 각 멤버변수에 접근제어자를 통한 캡슐화 적용
		// 1-3. 의류 배열생성 필요한 각 객채 생성 후 적용
		// 2-1. 제시된 항목에 주석 작성
		// 2-2. 서비스 객체 생성 후 조회코드 호출
		// 2-3. 제안된 예시대로 데이터를 반영후 출력
		// 3-1. 외부라이브러리 검색
		// 3-2. 라이브러리 불러오기
		// 3-3. 라이브러리 반영하기
		
		// 제시된 한개의 클래스를 scenario.clothing 패키지에 4개의 클래스로 분리한다.
		
		// 10001	RED		M	true	면		봄
		// 10002	BLUE	L	true	면		봄
		// 10003	BLACK	XL	true	나일론	여름
		// 10004	PINK	M	true	면		봄
		// 10005	RED		S	false	폴리	겨울
		
		// 의류데이터를 담을 배열 생성
		Clothing[] clothings = new Clothing[5];
		
		int count = 0;
		// 각 배열의 위치에 의류객체 생성후 대입
		clothings[count++] = new Clothing(10001, "RED", "M", true, "면", "봄");
		clothings[count++] = new Clothing(10002, "BLUE", "L", true, "면", "봄");
		clothings[count++] = new Clothing(10003, "BLACK", "XL", true, "나일론", "여름");
		clothings[count++] = new Clothing(10004, "PINK", "M", true, "면", "봄");
		clothings[count++] = new Clothing(10005, "RED", "S", false, "폴리", "겨울");
		
		// 기능 조회를 위한 서비스 객체 생성
		ClothingService service = new ClothingService();
		service.list(clothings);
		
		
	}
}
