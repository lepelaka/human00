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
		students[count++] = new Student(4, "고길동", 90, 80, 75);
		students[count++] = new Student(5, "고철수", 90, 80, 75);
	}
	// 기능에 대한 관리(CRUD)
	// CREATE, READ, UPDATE, DELETE
	// 추가
	
	// 1. 삭제 로직 구현
	// 2. 모든 필드에 대해 (Student의 필드) private로 변경, 필요에 따라 getter, setter 추가 
	
	void add() {
		// 1. 빈 객체를 하나 만들고 각각 setter를 이용해서 값을 저장
		// 2. 지역변수에 각각 값을 입력 받은 후 생성자를 통해서 일괄적으로 객체 생성
		
//		Student student = new Student();
//		System.out.print("학번 > ");
//		student.setNo(nextInt());
//		System.out.print("이름 > ");
//		student.setName(nextLine());
//		System.out.print("국어 > ");
//		student.setKor(nextInt());
//		System.out.print("영어 > ");
//		student.setEng(nextInt());
//		System.out.print("수학 > ");
//		student.setMat(nextInt());
		
		System.out.print("학번 > ");
		int no = nextInt();
		System.out.print("이름 > ");
		String name = nextLine();
		System.out.print("국어 > ");
		int kor = nextInt();
		System.out.print("영어 > ");
		int eng = nextInt();
		System.out.print("수학 > ");
		int mat = nextInt();
		
		students[count++] = new Student(no, name, kor, eng, mat);
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
			student.setName(nextLine());
			System.out.print("국어 > ");
			student.setKor(nextInt());
			System.out.print("영어 > ");
			student.setEng(nextInt()); 
			System.out.print("수학 > ");
			student.setMat(nextInt()); 
		}
	}
	// 게시판 CRUD
	Student findByNo(int no) {
		Student student = null; // 주소값 없음
		// {0x100, 0x200, 0x300}
		
		for(int i = 0 ; i < count ; i++ ) { 
			if(students[i].getNo() == no) { // 사용자 입력값 == 기존학생 배열의 학번
				student = students[i]; // 주소값 복사
			}
		}
		return student;
	}
	// 삭제
	void remove() {
		System.out.print("삭제할 학생의 학번을 입력하세요 > ");
		int no = nextInt();
		int idx = -1;
		for(int i = 0 ; i < count ; i++) { // 
			if(students[i].getNo() == no) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("찾는 학생이 없습니다");
			return;
		}
		
//		// 삭제로직
//		students[idx] = students[idx+1];
//		
//		for(int i = 0 ; i < count-1 ; i++) {
//			students[idx+i] = students[idx+1+i];
//		}
//		students[count-1] = null;
		
		System.arraycopy(students, idx+1, students, idx, count-- -idx-1);
	}
}
