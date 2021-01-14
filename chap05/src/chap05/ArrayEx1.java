package chap05;

public class ArrayEx1 {
	public static void main(String[] args) {
		// 배열 : Array [ ]
		// 단일 데이터 타입에대해 연속적으로 저장
		// 크기가 고정, 변화 불가, 참조형 변수
		
		int[] scores;
//		String[] people; // 비추천
		
		String[] people = {"둘리", "도우너", "고길동"}; // 값, 길이
		
		for(int i = 0; i < people.length ; i++) {
			System.out.println(people[i]);
		}
		
		people[1] = "마이콜";
		System.out.println();
		for(int i = 0; i < people.length ; i++) {
			System.out.println(people[i]);
		}
	}
}
