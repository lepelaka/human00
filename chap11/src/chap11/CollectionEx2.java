package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx2 {
	public static void main(String[] args) {
		// list2
		// .add()
		// 삭제
		// 수정 set()
		// 조회 get()
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println(list);
		
		for(int i = 0 ; i < list.size() ;i++) {
			// list[i]
			System.out.println(list.get(i));
		}
		
		list.set(2, 80);
		System.out.println(list);
		
		list.add(2, 90);
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);
		
		list.add(50);
		System.out.println(list);
		
		System.out.println(list.indexOf(50));
		System.out.println(list.lastIndexOf(50));
		
		List<String> list2 = new ArrayList<>();
		list2.add("둘리");
		list2.add("도우너");
		list2.add("또치");
		list2.add("고길동");
		list2.add("희동이");
		System.out.println(list2);
		
		list2.remove(3);
		System.out.println(list2);
		list2.remove("둘리");
		System.out.println(list2);
		
		String str = new String("고철수");
		list2.add(2, str);
		System.out.println(list2);
		
		list2.remove(str);
		System.out.println(list2);
		
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list3 = Arrays.asList(arr);
		
		System.out.println(list3);
		
	}
}
