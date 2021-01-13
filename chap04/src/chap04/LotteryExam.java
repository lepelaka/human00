package chap04;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class LotteryExam {
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
		
		List<Integer> result = list.subList(0, 5); 
		System.out.println(result);
		
		// 7 : 노진주 
		// 9 : 민지현
		// 10 : 박상훈
		// 20 : 이찬희
		// 21 : 이혜영
		
	}
}
