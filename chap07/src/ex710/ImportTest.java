package ex710;

import java.text.*;

public class ImportTest {
	public static void main(String[] args) {
		java.util.Date today = new java.util.Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 : " + date.format(today));
		System.out.println("지금 시간은 : " + time.format(today));
		
		System.out.printf("%-5d%-5d%-5d%-5d\n", 10, 20, 30, 40);
		System.out.println(String.format("%-5d%-5d%-5d%-5d", 10, 20, 30, 40));
	}
}
