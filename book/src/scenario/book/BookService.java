package scenario.book;

public class BookService {
	// 조회
	public void list(Book[] books) {
		String[] listInfo = new String[] { "도서번호", "도서명", "출판사", "저자", "등록일" };
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println(BookUtils.getFormat(listInfo));
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		/*
		 * 2-2. 도서내용을 출력할 수 있게 코드 작성 hint : BookUtils 클래스의 getBookInfo메서드를 활용하시오
		 */
		for(int i = 0 ; i < books.length ; i++) {
			System.out.println(BookUtils.getBookInfo(books[i], true));
		}
	}
}
