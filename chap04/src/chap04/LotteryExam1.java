package chap04;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class LotteryExam1 {
	public static void main(String[] args) {
		Integer[] arr = new Integer[23];
		for(int i = 0 ; i < 23 ; i++) {
			arr[i] = i+1;
			if(i == 15 || i == 23) {
				continue;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.asList(arr);
		list.set(15, 23);
		list.set(22, 25);
		
		System.out.println("셔플전");
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println("셔플후");
		System.out.println(list);
		
		List<Integer> result = list.subList(0, 4); 
		System.out.println(result);
		
		// 15 : 오승현
		// 6 : 김소연
		// 8 : 류슬희
		// 14 : 양수봉
		
		
		// 13 : 신세영
		// 1 : 강영훈
		
		
		
	}
}
