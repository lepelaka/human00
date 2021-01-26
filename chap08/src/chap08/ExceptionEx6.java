package chap08;

public class ExceptionEx6 {
	public static void main(String[] args) {
		// 예외처리시 새로 배우게될 예약 try catch finally throw throws
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 고의로 예외를 유발
//			System.out.println(args[0]); // <<<
			System.out.println(4);
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException) {
				
			}
			else if(e instanceof ArrayIndexOutOfBoundsException) {
				
			}
			
			System.out.println(e);
			System.out.println(e.getMessage());
			StackTraceElement[] ste = e.getStackTrace();
			for(StackTraceElement st : ste) {
				System.out.println("StackTraceElement : " + st);
			}
			System.out.println(5);
		}
		catch (RuntimeException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(6);
		
		// Exception 최고 조상
		// RuntimeException 
		// ArimeticException
	}
}
