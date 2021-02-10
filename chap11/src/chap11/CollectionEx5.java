package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionEx5 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(1);
		arrayList.add(2);
		
		Iterator<Integer> it = arrayList.iterator();
//		while(it.hasNext()) { // 5
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		it = arrayList.iterator();
		System.out.println(it.next());
//		}
		
		for(Integer i : arrayList) {
			System.out.println(i);
		}
		
		Integer[] arr = new Integer[5];
		Arrays.setAll(arr, (a) -> (int)(Math.random() * 5)+1);
		System.out.println(Arrays.toString(arr));
		
		// {1,2,3,4,5,6,7,8} n > 1000 n > logn
		
		// 
		// 6
		// 이진탐색 > logn = 10
		// {1,2,3,4} {5,6,7,8}
		// {1,2} {3,4} {5,6} {7,9}
		// 1~8각각
		
	}
}
