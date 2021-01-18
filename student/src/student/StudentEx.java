package student;

import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		
		ss.students[0] = new Student();
		ss.students[0].no = 1;
		ss.students[0].name = "둘리";
		ss.students[0].kor = 90;
		ss.students[0].eng = 70;
		ss.students[0].mat = 70;
		ss.count++;
		
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println("1.조회 2. 추가 3. 수정 4. 삭제 5. 정렬 6. 종료");
			System.out.println("----------------------------------------------");
			int input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				ss.list(); // 호출
				break;
			case 2:
				ss.add();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				ss.remove();
				break;
			case 5:
				System.out.println("준비중입니다");
				break;
			case 6:
				return; // 메서드 종료(main method)

			}
		}
		scanner.close();
		
		
	}
}
