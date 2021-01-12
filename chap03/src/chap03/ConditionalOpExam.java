package chap03;

public class ConditionalOpExam {
	public static void main(String[] args) {
		int score = 95;
		char grade = score >= 90 ? 'A' : 'F';
		grade = score >= 90 ? 'A' : score >= 80 ? 'B' : 'F';
		grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >=70 ? 'C' : 'F';
		
		grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >=70 ? 'C' : score >= 60 ? 'D' : 'F';
		
		System.out.println(grade);
	}
}
