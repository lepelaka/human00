package chap06;

public class ParamEx {
	public static void main(String[] args) {
	
		// 매개변수(parameter) : int a, int b
		// 인자(argument) : 10, 20
		double result = divide(10, 20, 10);
		System.out.println(result);
		
		
	}
	
	
	static double divide(int a, int b, int c) {
		return (double)a/b;
	}
	static double divide(int a, int b) {
		return (double)a/b;
	}
	static double divide(int a, double b) {
		return (double)a/b;
	}
	static double divide(double a, double b) {
		return (double)a/b;
	}
	static double divide(double a, int b) {
		return (double)a/b;
	}
}
