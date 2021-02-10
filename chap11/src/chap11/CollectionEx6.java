package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionEx6 {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		for(int i = 0 ; i < 10 ; i++) {
			int rand = (int)(Math.random() * 10) + 1;
			integers.add(rand);
		}
		System.out.println(integers);
		Collections.sort(integers);
		System.out.println(integers);
		
		///
		Collections.sort(integers, (o1, o2) -> o2 - o1);
		
		///
		Collections.sort(integers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		///
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		};
		
		Collections.sort(integers, c);
		
		System.out.println(integers);
		
		Collections.sort(integers, new MyCompa());
	}
	
}
class MyCompa implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}
}
