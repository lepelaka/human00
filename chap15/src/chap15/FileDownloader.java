package chap15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class FileDownloader {
	public static void main(String[] args) throws IOException {
//		String urlString = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		
		System.out.print("다운로드 받을 이미지의 경로를 입력하세요 > ");
		String urlString = new Scanner(System.in).nextLine();
		
		URL url = new URL(urlString);
		String fileName = url.getFile().substring(url.getFile().lastIndexOf("/")+1);
		String targetString = "C:\\Users\\User\\Documents\\" + fileName;
		
		InputStream is = url.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetString));
		
		int b;
		while((b = bis.read()) != -1) { // read() 한번에 1byte씩
			bos.write(b);
		}
		bos.close();
		
	}
}
