package student;

import static student.StudentUtils.*; // static import

public class StudentService {
	// 학생에 대한 관리(필드)
	// 배열로 학생들을 관리
	Student[] students = new Student[10];
	int count;
	
	{
		students[count++] = new Student(1, "둘리", 90, 70, 70);
		students[count++] = new Student(2, "도우너", 90, 100, 80);
		students[count++] = new Student(3, "또치", 90, 80, 75);
	}
	// 기능에 대한 관리(CRUD)
	// CREATE, READ, UPDATE, DELETE
	// 추가
	
	// 1. 삭제 로직 구현
	// 2. 모든 필드에 대해 (Student의 필드) private로 변경, 필요에 따라 getter, setter 추가 
	
	void add() {
		Student student = new Student();
		System.out.print("학번 > ");
		student.no = nextInt();
		System.out.print("이름 > ");
		student.name = nextLine();
		System.out.print("국어 > ");
		student.kor = nextInt();
		System.out.print("영어 > ");
		student.eng = nextInt();
		System.out.print("수학 > ");
		student.mat = nextInt();
		
		students[count++] = student;
	}
	// 조회(목록 조회)
	void list() { // 선언
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		
		for(int i = 0 ; i < count ; i++) {
			System.out.println(students[i]);
		}
	}
	// 수정
	void modify() {
		list(); 
		System.out.print("수정할 학생의 학번을 입력하세요 > ");
		int input = nextInt();
		// 
		
		Student student = findByNo(input); // 도우너 객체
		
		if(student == null) {
			System.out.println("학번을 찾을 수 없습니다.");
		}
		else {
			System.out.print("이름 > ");
			student.name = nextLine();
			System.out.print("국어 > ");
			student.kor = nextInt();
			System.out.print("영어 > ");
			student.eng = nextInt();
			System.out.print("수학 > ");
			student.mat = nextInt();
		}
	}
	// 게시판 CRUD
	Student findByNo(int no) {
		Student student = null; // 주소값 없음
		// {0x100, 0x200, 0x300}
		
		for(int i = 0 ; i < count ; i++ ) { 
			if(students[i].no == no) { // 사용자 입력값 == 기존학생 배열의 학번
				student = students[i]; // 주소값 복사
			}
		}
		return student;
	}
	// 삭제
	void remove() {
		System.out.println("remove()");
	}
}
