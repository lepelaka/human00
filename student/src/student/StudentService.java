package student;

public class StudentService {
	// 학생에 대한 관리(필드)
	// 배열로 학생들을 관리
	Student[] students = new Student[10];
	int count;
	
	// 기능에 대한 관리(CRUD)
	// CREATE, READ, UPDATE, DELETE
	// 추가
	void add() {
		System.out.println("add()");
	}
	// 조회
	void list() {
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		
		for(int i = 0 ; i < count ; i++) {
			System.out.println(students[i]);
		}
	}
	// 수정
	void modify() {
		System.out.println("modify()");
	}
	// 삭제
	void remove() {
		System.out.println("remove()");
	}
}
