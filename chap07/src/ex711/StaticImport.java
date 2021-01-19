package ex711;

import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;
import static java.lang.System.out;

import org.apache.commons.lang3.StringUtils;

public class StaticImport {
	public static void main(String[] args) {
		out.println(Math.random());
		out.println(PI);
		parseInt("1234");
		System.out.println(StringUtils.trim("  a bc "));
		System.out.println(StringUtils.deleteWhitespace("a bc d   e"));
		
		// jar import
		// 프로젝트 우클릭 > 프로퍼티스 > 자바 빌드패스 > 라이브러리 > 외부 jar 추가하기
	}
}
