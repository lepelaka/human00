package scenario.book;

public class Book {
	// 도서번호, 도서명, 출판사, 저자, 도서등록일
	/*
	 * 1-1. 도서번호, 도서명, 출판, 저자, 도서등록일 필드 생성 
	 * 1-2. 각 멤버변수에 접근제어자를 통한 캡슐화 적용
	 */
	private int no; // 도서번호
	private String name; // 도서명
	private String publisher; // 출판사
	private String author; //저자
	private String regDate; // 도서등록일
	
	
	public Book() {	}
	
	public Book(int no, String name, String publisher, String author, String regDate) {
		this.no = no;
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.regDate = regDate;
	}


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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}

/**
 * 
 * 아래 조건에 맞게 Java프로그램을 작성하시오. - 교사가 제시한 1개 클래스 프로젝트를 scenario.book 패키지에 4개의 클래스로
 * 분리한다.(아래) - BookEx(main함수), Book(int no, String name, String publisher,
 * String author, String regDate필드), BookService(list 메서드), BookUtils(유틸리티 클래스
 * 메서드) - 각 클래스정보: 여러명의 도서정보(Book)를 전달받고(BookEx), 도구를 활용(BookUtils),
 * 출력(BookService)하는 메소드 선언하기. - Book클래스의 필드, BookEx의 실행구문, BookService의 출력메서드에
 * 주석을 활용하여 서술하기. - BookUtils클래스에서 의존하는 외부라이브러리를 검색을 통해 확인 하고, 해당 라이브러리를 다운로드 받아
 * 현재 작업중인 프로젝트 반영 후 적용하시오. - 아래처럼 출력 되도록 프로그램 작성. (단, 실전웹프로그래밍 저자 이름은 본인 이름이
 * 나오도록 변경하시오.)
 * ----------------------------------------------------------------------------------------------
 * 도서번호 도서명 출판사 저자 등록일
 * ----------------------------------------------------------------------------------------------
 * 1 자유로부터의도피 문예출판사 에리히프롬 2021-01-19 2 자바의정석 도우출판 남궁성 2021-01-20 3 실전웹프로그래밍
 * 휴먼교육센터 박종민 2021-01-22 4 변신 태동출판사 프란츠카프카 2021-01-22 5 1984 문학동네 조지오웰
 * 2021-01-22
 */




