package abstracttest;

public class AbstractTest {
	public static void main(String[] args) {
		Emp[] emps = new Emp[3];
		emps[0] = new Programmer();
		emps[1] = new Designer();
		emps[2] = new PlannerSub();
		// 다형성으로 제작
		
		for(Emp e : emps) {
//			if(e instanceof Programmer) {
//				((Programmer)e).work();
//			}
//			else if(e instanceof Designer) {
//				((Designer)e).work();
//			}
			e.work();
		}
		
		// ? Emp로 인스턴스
		
	}
}

// 사원
// 프로그래머
// 디자이너
// 

abstract class Emp {
	abstract void work();
}

class Programmer extends Emp {
	void work() {
		System.out.println("프로그래머가 개발을 합니다.");
	}
}

class Designer extends Emp {
	void work() {
		System.out.println("디자이너가 디자인을 합니다.");
	}
}

abstract class Planner extends Emp {
	
}

class PlannerSub extends Planner {
	void work() {
		System.out.println("기획자의 자손인스턴스가 기획을 합니다.");
	}
}