package ex76;

public class PointTest {
	public static void main(String[] args) {
		Point p = new Point();
		p.x = 10;
		p.y = 15;
		System.out.println(p.getLocation());
		
		Point3D p3 = new Point3D();
		p3.x = 20;
		p3.y = 30;
		p3.z = 10;
		System.out.println(p3.getLocation());
		
		// 다형성 예습
		Point[] ps = new Point[2];
		ps[0] = p;
		ps[1] = p3;
		
		for(Point point : ps) {
			System.out.println(point.getLocation());
		}
	}
}

class Point {
	int x;
	int y;
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point{
	int z;
	String getLocation() {
//		return "x : " + x + ", y : " + y + ", z : " + z;
		return super.getLocation() + ", z : " + z; 
	}
}
