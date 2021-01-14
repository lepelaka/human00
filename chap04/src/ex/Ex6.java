package ex;

public class Ex6 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				int tmpi = i-2;
				int tmpj = j-2;
				String a = tmpi < 0 ? tmpi+"" : " " + tmpi ;
				String b = tmpj < 0 ? tmpj+"" : " " + tmpj ;
				
				if(tmpi * tmpj <= 1 && tmpi * tmpj >= -1) {
					System.out.print("*");
//					System.out.print("("+a+","+b+")");
				}
				else {
					System.out.print(" ");
//					System.out.print("       ");
				}
			}
			
			System.out.println();
		}
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				if(i >= j) {
//					//System.out.print("*");
//					System.out.print("("+i+","+j+")");
//				}
//				else {
//					//System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				if(i+j <= 4) {
//					//System.out.print("*");
//					System.out.print("("+i+","+j+")");
//				}
//				else {
//					//System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		// 3
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				if(i <= j) {
//					//System.out.print("*");
//					System.out.print("("+i+","+j+")");
//				}
//				else {
//					System.out.print("     ");
//				}
//			}
//			System.out.println();
//		}
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 5 ; j++) {
//				if(i+j >= 4) {
//					//System.out.print("*");
//					System.out.print("("+i+","+j+")");
//				}
//				else {
//					System.out.print("     ");
//				}
//			}
//			System.out.println();
//		}
	}
}
/*
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * *****
 *  ****
 *   ***
 *    **
 *     *
 *     
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 *   *
 *  ***
 * *****
 *  ***
 *   *
 * 
 * 
 * 
 */

/*
 * *!!!!
 * **!!!
 * ***!!
 * ****!
 * *****
 */