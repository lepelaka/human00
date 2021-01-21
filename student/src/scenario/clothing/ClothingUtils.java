package scenario.clothing;

import org.apache.commons.lang3.StringUtils;

public class ClothingUtils {
	// 의류 항목이 길어졌을때 축약 출력
	public static String getClothingInfo(Clothing clothing, boolean isShort) {
		String[] strs = { clothing.getCode() + "", clothing.getColor(), clothing.getSize(), clothing.isUpper() + "",
				clothing.getFabric(), clothing.getSeason() };
		if (isShort)
			strs = subContent(strs, 3);
		return getFormat(strs);
	}

	// 출력시 사용할 텍스트량 조절
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

	// 한글 5글자 초과할때 말줄임표 붙이기
	public static String[] subContent(String[] strs, int lastIdx) {
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() > 10 && isKorean(strs[i])) {
				strs[i] = StringUtils.substring(strs[i], 0, 9) + "..";
			}
		}
		return strs;
	}

	// 한글여부 체크(한글자라도 한글이 포함되면 한글로 인식)
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
