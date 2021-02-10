package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionEx3 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		ArrayList<String> arrayList = new ArrayList<>(1_000_000);
		
		// 100만개 추가
		System.out.println("순차추가");
		System.out.println("arrayList : " + add(arrayList) + "ms");
		System.out.println("linkedList : " + add(linkedList) + "ms");
		
		// 1만개 추가
		System.out.println("중간추가");
		System.out.println("arrayList : " + add2(arrayList) + "ms");
		System.out.println("linkedList : " + add2(linkedList) + "ms");

		// 101만개 조회
		System.out.println("조회");
		System.out.println("arrayList : " + access(arrayList) + "ms");
		System.out.println("linkedList : " + access(linkedList) + "ms");

		ArrayList<String> tmp = new ArrayList<>(linkedList);
		LinkedList<String> tmp2= new LinkedList<>(arrayList);
		
		// 1만개 삭제
		System.out.println("중간삭제");
		System.out.println("arrayList : " + remove(arrayList) + "ms");
		System.out.println("linkedList : " + remove(linkedList) + "ms");
		
		// 100만개 삭제
		System.out.println("순차삭제");
		System.out.println("arrayList : " + remove2(arrayList) + "ms");
		System.out.println("linkedList : " + remove2(linkedList) + "ms");
		
		
	}
	
	static long add(List<String> list) { // 순차 추가
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 1_00_000 ; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10_000 ; i++) {
			list.add(0, i+"");
		}
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	// 중간 삭제
	static long remove(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10_000 ; i++) {
			list.remove(0);
		}
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	// 순차 삭제
	static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = list.size()-1 ; i > 0 ; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	// 조회
	static long access(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < list.size() ; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
}
