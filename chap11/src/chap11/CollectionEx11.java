package chap11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionEx11 {
	public static void main(String[] args) {
		String str = "ABCABADDDDABCDCCCDAA";
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			String s = str.charAt(i) + "";
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1); 
			}
			else {
				map.put(s, 1);
			}
		}
		
		System.out.println(map);
//		map.
		// 1. key set
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			
			System.out.print(key + " : ");
			for(int i = 0 ; i < value ; i++) {
				System.out.print("#");
			}
			System.out.println(" " + value);
		}
		
		// 2. entry set
		Set<java.util.Map.Entry<String, Integer>> entries = map.entrySet();
		for(java.util.Map.Entry<String, Integer> entry : entries) {
			System.out.print(entry.getKey() + " : ");
			for(int i = 0 ; i < entry.getValue() ; i++) {
				System.out.print("#");
			}
			System.out.println(" " + entry.getValue());
		}
		
		// List<Student> : 장점 type safe
		// List<Map<String, String>> : 장점 편의성
		set.forEach((a) -> System.out.println(a));
		map.forEach((key, value) -> {
			System.out.print(key + " : ");
			for(int i = 0 ; i < value ; i++) {
				System.out.print("#");
			}
			System.out.println(" " + value);
		});
//		TreeMap<String, Integer> treeMap = new TreeMap<>(new MyComparator());
//		System.out.println(treeMap);
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(new MyComparator());
		System.out.println(list);
		
		
		
	}
}

class MyComparator implements Comparator<Entry<String, Integer>> {
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o2.getValue() - o1.getValue();
	}
}
