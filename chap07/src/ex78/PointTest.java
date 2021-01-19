package ex78;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println(p3.getLocation());
	}
}

class Point extends Object {
	int x;
	int y;
	public Point() {}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point{
	int z;
	public Point3D() {
		this(100, 200, 300);
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	String getLocation() {
		return super.getLocation() + ", z : " + z; 
	}
}
