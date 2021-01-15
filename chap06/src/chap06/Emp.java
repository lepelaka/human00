package chap06;

public class Emp {
	int empno;
	String ename;
	String job;
	int sal;
	int deptno;
	// override : 재정의
	// toString override 
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", deptno=" + deptno
				+ "]";
	}
	
	
	
	
}
