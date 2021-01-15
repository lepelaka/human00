package chap06;

public class EmpEx {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.empno = 7369;
		e1.ename = "SMITH";
		e1.job = "CLERK";
		e1.sal = 800;
		e1.deptno =20;
		System.out.println(e1.toString() ); 
		System.out.println(e1); 
		
	}
}
