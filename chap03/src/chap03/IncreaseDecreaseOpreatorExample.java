package chap03;

public class IncreaseDecreaseOpreatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;
		++x;
		System.out.println("x="+x);
		
		System.out.println("------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("------------------");
		z = x++;
		System.out.println("z="+z);
		System.out.println("x="+x); // 13
		
		System.out.println("------------------");
		z = ++x; // 14
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("------------------");
		z = ++x + y++; // 15 + 9
		System.out.println("z="+z); // 23
		System.out.println("x="+x); // 15
		System.out.println("y="+y); // 9
		
		
		// x 15
		
		x = x + 1;
		x++;
		
		
		
		
		
	}
}
