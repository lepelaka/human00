package student;

import java.util.Comparator;

// API의 대상
public class Student implements Cloneable, Comparable<Student>{
	// 학번, 이름, 국어, 영어, 수학(필드로 정의)
	// 총점, 평균(메서드로 정의)
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public final static Comparator<Student> RANK_ORDER = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return -(o1.getTotal() - o2.getTotal());
		}
	};
	
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

	// getter, setter
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
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

	@Override
	protected Student clone() {
		Student student = null;
		try {
			student = (Student)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public int compareTo(Student o) {
		return no - o.no; // 오름차순 >> 내림차순
	}
}
