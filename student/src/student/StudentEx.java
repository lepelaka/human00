package student;

import static student.StudentUtils.*; // static import

public class StudentEx {
	public static void main(String[] args) {
		execute();
	}

	static void execute() {

		StudentService ss = new StudentService();

		boolean run = true;
		while (run) {
			try {
				System.out.println();
				System.out.println("----------------------------------------------");
				System.out.println("1.조회 2. 추가 3. 수정 4. 삭제 5. 정렬 6. 종료");
				System.out.println("----------------------------------------------");
				int input = nextInt();
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
					ss.sort();
					break;
				case 6:
					return; // 메서드 종료(main method)
				default:
					throw new MyRangeException(1, 6);
//					System.out.println("1부터 6사이의 값을 입력하세요");
				}
			} catch (NumberFormatException e) {
				System.out.println("정확한 숫자값을 입력해주세요");
				e.printStackTrace();
			} catch (MyRangeException e) {
				System.err.println(e.getMessage());
			}
		}

	}
}
