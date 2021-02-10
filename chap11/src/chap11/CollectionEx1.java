package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionEx1 {
	public static void main(String[] args) {
		System.out.println();
		// Class<?> cls = obj.getClass();
		
		// 마치~ 배열 []
		int[] arr = new int[5]; // int타입의 다섯개의 공간을 가지는 배열생성
		String[] arr2 = new String[5];
		List<Integer> list = new ArrayList<Integer>(); // 타입(x) 길이(x) // generic을 이용해 타입을 결정
		List<String> list2 = new ArrayList<>();
		
		
		
		list.add(new Integer(3));
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(7);
		
		System.out.println(list);
		
		
		// 다형성 : 조상클래스(인터페이스)로 선언 자손클래스의 인스턴스를 사용
		// list의 0번 인덱스부터 3인덱스 미만의 값을 잘라서 list3인스턴스에 새 객체 생성
		List<Integer> list3 =  new ArrayList<>(list.subList(0, 3));
		
		System.out.println(list3);
		
		// 정렬
		Collections.sort(list);
		Collections.sort(list3);
		
		System.out.println();
		System.out.println(list);
		System.out.println(list3);
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		
		System.out.println();
		System.out.println(list);
		System.out.println(list3);
		
//		list.removeAll(list3);
		list.addAll(list3);
//		list.retainAll(list3); // list의 내부내용이 변경
		
		System.out.println();
		System.out.println(list);
		System.out.println(list3);
		
		// union 합집합 union all
	}
}
