package chap09;

import java.util.Date;
import java.util.Random;
import java.util.Arrays;

public class AddrSortEx {
	public static void main(String[] args) {
		String[] strs = {"A", "C", "E", "B", "D"};
		Arrays.sort(strs);
		
		System.out.println(Arrays.toString(strs));
		
		Addr[] addrs = new Addr[3];
		addrs[0] = new Addr("둘리", "010-4444-4444");
		addrs[1] = new Addr("도우너", "010-5555-5555");
		addrs[2] = new Addr("또치", "010-3333-3333");
		
		Arrays.sort(addrs);
		System.out.println(Arrays.toString(addrs));
		
		System.out.println(System.currentTimeMillis());
		
		System.out.println(new Date(0).toLocaleString());
		
		Date christmas = new Date(121, 11, 25);
		Date now = new Date(System.currentTimeMillis());
		
		System.out.println(christmas.toLocaleString());
		System.out.println(now.toLocaleString());
		
		System.out.println(christmas.getTime() - now.getTime());
		long remain = christmas.getTime() - now.getTime();
		System.out.println(remain / 1000 / 60 / 60 / 24);
//		System.out.println(now.getTime());
//		System.out.println(christmas - now);
		
		System.out.println(new Random(System.currentTimeMillis()).nextInt(6)+1);
		System.out.println(new Random(0).nextDouble());
		System.out.println(new Random(0).nextDouble());
		System.out.println(new Random(0).nextDouble());
		System.out.println(new Random(0).nextDouble());
	}
}
