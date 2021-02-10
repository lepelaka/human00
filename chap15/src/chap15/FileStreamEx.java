package chap15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileStreamEx {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\target.txt");
		FileReader fr = new FileReader("C:\\Users\\User\\Documents\\target.txt");
		int b = 0;
		
		while((b = fis.read()) != -1) { // read() 한번에 1byte씩
			System.out.println(b + " ::: " + (char)b);
		}
		System.out.println("================= 절 취 선 ==================");
		b = 0;
		while((b = fr.read()) != -1) { // read() 한번에 1char씩
			System.out.println(b + " ::: " + (char)b);
		}
		
		fis.close();
		fr.close();
		// Iterator next()
		
		// 파일 복사
	}
}
