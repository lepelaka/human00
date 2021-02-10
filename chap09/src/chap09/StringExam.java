package chap09;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) throws Exception {
		String url = "https://search.naver.com/search.naver?"
				+ "where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
//		// query string
//		// indexOf, substring, split
//		String tmp = url;
//		String protocol = url.substring(0, url.indexOf("://"));
//		System.out.println("프로토콜 : " + protocol);
//		
//		tmp = url.substring(url.indexOf("://")+3);
//		String domain = tmp.substring(0, tmp.indexOf("/"));
//		System.out.println("도메인 : " + domain);
//		tmp = tmp.substring(tmp.indexOf("/")+1);
//		String fileName = tmp.substring(0, tmp.indexOf("?"));
//		System.out.println("파일명 : " + fileName);
//		
//		String queryString = tmp.substring(tmp.indexOf("?")+1);
//		System.out.println("쿼리스트링 : " + queryString);
//		
//		String[] strs = queryString.split("&");
//		
//		for(String str : strs) {
//			String[] s = str.split("=");
//			System.out.println("param name : " + s[0] + ", param value : " + s[1]);
//		}
		URL url2 = new URL(url);
		
		System.out.println(url2.getProtocol());
		System.out.println(url2.getHost());
		System.out.println(url2.getPath());
		System.out.println(url2.getFile());
		System.out.println(url2.getQuery());
		
		URL url3 = new URL("https://images.mypetlife.co.kr/content/uploads/2019/09/06150205/cat-baby-4208578_1920.jpg");
		InputStream is = url3.openStream();
		FileOutputStream fos = new FileOutputStream("cat.jpg");
		int b = 0;
		while((b = is.read()) != -1) {
			fos.write(b);
		}
		fos.close();
	}
}

//class MyUrl {
//	String protocol;
//	String domain;
//	String fileName;
//	Param[] params;
//	
//	class Param {
//		String paramName;
//		String paramValue;
//	}
//}


