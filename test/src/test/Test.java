package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str == null);
		System.out.println(str.equals(""));
		char[] chars = str.toCharArray();
		for(char c : chars) {
			System.out.println((int) c);
		}
	}
}
