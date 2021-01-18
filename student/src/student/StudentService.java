package student;

import java.util.Scanner;

public class StudentService {
	// 학생에 대한 관리(필드)
	// 배열로 학생들을 관리
	Student[] students = new Student[10];
	Scanner scanner = new Scanner(System.in);
	int count;
	
	// 기능에 대한 관리(CRUD)
	// CREATE, READ, UPDATE, DELETE
	// 추가
	
	// 1. 기본데이터 더미데이터 초기화 블럭으로 옮기세요
	// 2. 수정 로직을 작성하세요(학번 값입력 , 학번 값 기준으로 이름, 국어, 영어, 수학값을 수정)
	// 3. 생성자 오버로딩으로 제작
	// 기본, 5개의 기본입력데이터
	
	void add() {
		Student student = new Student();
		System.out.print("학번 > ");
		student.no = Integer.parseInt(scanner.nextLine());
		System.out.print("이름 > ");
		student.name = scanner.nextLine();
		System.out.print("국어 > ");
		student.kor = Integer.parseInt(scanner.nextLine());
		System.out.print("영어 > ");
		student.eng = Integer.parseInt(scanner.nextLine());
		System.out.print("수학 > ");
		student.mat = Integer.parseInt(scanner.nextLine());
		
		students[count++] = student;
	}
	// 조회
	void list() { // 선언
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		
		for(int i = 0 ; i < count ; i++) {
			System.out.println(students[i].toString());
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
