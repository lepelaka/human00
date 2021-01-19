package student;

// API의 대상
public class Student {
	// 학번, 이름, 국어, 영어, 수학(필드로 정의)
	// 총점, 평균(메서드로 정의)
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	public Student() {} // 기본생성자

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Student(Student s) {
		this.no = s.no;
		this.name = s.name;
		this.kor = s.kor;
		this.eng = s.eng;
		this.mat = s.mat;
	}

	int getTotal() { // 인스턴스 메서드
		return kor+eng+mat;
	}
	
	double getAvg() {
		return getTotal() * 100 / 3 / 100.0;
	}

	public String toString() {
		return no + "\t" +
				name + "\t" +
				kor + "\t" +
				eng + "\t" +
				mat + "\t" +
				getTotal() + "\t" +
				getAvg();
	}
}
