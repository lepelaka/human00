package scenario.book;

import org.apache.commons.lang3.StringUtils;

public class BookUtils {
	// 책 내용 toString 긴내용 축약 출력
	public static String getBookInfo(Book book, boolean isShort) {
		String[] strs = { book.getNo() + "", book.getName(), book.getPublisher(), book.getAuthor(), book.getRegDate() };
		if (isShort) {
			strs = subContent(strs, 3);
		}
		return getFormat(strs);
	}

	// 출력시 사용할 텍스트량 조절 한글 5글자, 영문 10글자
	public static String getFormat(String[] strs) {
		String ret = "";
		for (String str : strs) {
			char[] words = str.toCharArray();
			int cnt = 20;
			for (char c : words) {
				if (c >= '가' && c <= '힣') {
					cnt--;
				}
			}
			ret += "%-" + cnt + "s";
		}
		return String.format(ret, (Object[]) strs);
	}

	// 한글 5글자를 초과할시 말 줄임표 붙이기
	public static String[] subContent(String strs[], int lastIdx) {
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() > 10 && isKorean(strs[i])) {
				strs[i] = StringUtils.substring(strs[i], 0, 9) + "..";
			}
		}
		return strs;
	}

	// 한글 여부 체크 (한글자라도 한글이 포함되면 한글로 인식)
	public static boolean isKorean(String str) {
		boolean ret = false;
		for (char c : str.toCharArray()) {
			if (c >= '가' && c <= '힣') {
				ret = true;
			}
		}
		return ret;
	}
}
