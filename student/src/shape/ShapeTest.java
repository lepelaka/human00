package shape;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[5];
		shapes[0] = new Circle(3);
		shapes[1] = new Rect(3, 4);
		shapes[2] = new Cylinder(3, 4); // 3: 반지름, 4: 원기둥의 높이 
		shapes[3] = new Cylinder((Circle)shapes[0], 5);
		shapes[4] = new Cube(3, 4, 5);
		
		for(Shape shape : shapes) {
			System.out.println(shape.getClass().getName());
			System.out.println("넓이는 : " + shape.getArea());
			if (shape instanceof Shape2DInter) { // 2차원 도형일때
				System.out.println("둘레는 : " + ((Shape2DInter)shape).getCircum());
			}
			else if (shape instanceof Shape3DInter) { // 3차원 도형일때
				System.out.println("부피는 : " + ((Shape3DInter)shape).getVolumn());
			}
		}
		
		/*
		 *  Shape
		 *  
		 *  Rect, Circle, Shape3D
		 *  
		 *                Cylinder, Cube
		 */
	}
}
abstract class Shape {
	private int x; // x Shape 클래스 내에서만 사용가능
	
	public Shape() {} // 생성자의 목적 : 인스턴스의 초기화
	

	public Shape(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public abstract double getArea(); // 넓이 구하기
}

interface Shape2DInter { // 2차원 도형에 대한 인터페이스
	double getCircum();
}
interface Shape3DInter { // 3차원 도형에 대한 인터페이스
	double getVolumn();
}

class Circle extends Shape implements Shape2DInter{

	public Circle() {}

	public Circle(int r) {
		super(r);
	}
	// 반지름
	// 넓이 구하기
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getX() * getX() * Math.PI;
	}

	// 둘레 구하기
	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return getX() * 2 * Math.PI;
	}
}

class Rect extends Shape implements Shape2DInter{
	private int y;

	public Rect() {
		super();
	}

	public Rect(int x, int y) {
		super(x);
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return (getX() + y) * 2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getX() * y;
	}
}

abstract class Shape3D extends Shape implements Shape3DInter{ // ? 인터페이스 대신 추상클래스를 선택한 이유 z
	private int z;

	
	public Shape3D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape3D(int x) {
		super(x);
	}
	
	public Shape3D(int x, int z) {
		super(x);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}

class Cylinder extends Shape3D { // 미구현 메서드
	private Circle circle;
	
	public Cylinder() {}
	
	public Cylinder(int r, int z) {
		super(r, z);
		circle = new Circle(r);
	}
	
	public Cylinder(Circle c, int z) {
		this.circle = c;
		setZ(z);
	}
	
	

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	@Override
	public double getVolumn() {
		// TODO Auto-generated method stub
		return circle.getArea() * getZ();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return circle.getArea() * 2 + circle.getCircum() * getZ();
	}
}

class Cube extends Shape3D {
	private Rect rect;
	public Cube() {	}

	public Cube(int x, int y, int z) {
		rect = new Rect(x, y);
		setZ(z);
		// TODO Auto-generated constructor stub
	}

	public Cube(Rect rect, int z) {
		this.rect = rect;
		setZ(z);
	}

	public Rect getRect() {
		return rect;
	}

	public void setRect(Rect rect) {
		this.rect = rect;
	}

	@Override
	public double getVolumn() {
		return rect.getArea() * getZ();
	}

	@Override
	public double getArea() {
		return rect.getCircum() * getZ() + rect.getArea() * 2;
	}
	
}

// 도형

// 원Circle > 반지름 
// 둘레, 넓이
// 사각형Rect > 너비, 높이
// 둘레, 넓이

// 원기둥Cylinder > z길이
// 넓이, 부피

// 육면체Cube > z길이
// 넓이, 부피

// 도형 >> 확장되었을때 정립
// 원기둥은 원을 가지고 있다. > 상속으로 표현하는게 맞지 않는가