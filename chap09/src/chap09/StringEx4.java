package chap09;

import java.util.StringJoiner;

public class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		System.out.println(sj);
		for(String s : arr) {
			sj.add(s);
		}
		System.out.println(sj);
		String result = sj.toString();
		System.out.println(result);
	}
}
