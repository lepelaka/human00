package rew02;

public class PrintfEx2 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f; // 1 * 10^1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.println(String.format("f1=%f, %e, %g%n", f1, f1, f1)); //
		System.out.printf("f1=%f, %e, %g\n", f1, f1, f1); // 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		
		// 2장 6시간
		// 3장 6시간
		// 4장 6시간
		// 5장 9시간
		// 6장 ?
		
		// 보강을 들었는데도 모르겠다. >> 멘토링
		// 자바 매주 금요일
		
		
		
		
		
	}
}
