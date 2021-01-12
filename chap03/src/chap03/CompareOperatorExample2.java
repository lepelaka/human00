package chap03;

import java.util.ArrayList;
import java.util.List;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		
		System.out.println(v2 == v3); // 피연산자간의 타입 맞추기
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		System.out.println(v4 == (double)v5); // false
		System.out.println((int)(v4*10) == (int)(v5*10));
		
		System.out.println(1*0.1f);
		System.out.println(1*0.1);
		
		// String 문자열 참조자료형
		String str = "가나다라"; // 리터럴형 생성
		String str2 = new String("가나다라"); // 참조 자료형 생성
		
		// 기본 자료형 : 변수에 데이터를 저장
		// 참조 자료형 : 변수에 데이터의 주소를 저장
		
		System.out.println("--------------------------------");
		Object obj = new Object();
		Object obj2 = new Object();
		Object obj3 = obj;
		
		System.out.println(obj != obj2); // ? 주소 비교
		System.out.println(obj == obj3); // ? 주소 비교
		
		// 동등비교연산자는 모든 자료형에 대해 비교를 할수 있음
				
	}
}
