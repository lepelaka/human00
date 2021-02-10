package chap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx2 {
	public static void main(String[] args) throws IOException {
		// 파일 복사 구현하기
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Documents\\target.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Documents\\target2.txt", true);
		// 파일의 총 크기 = 26byte
		
		byte[] bArr = new byte[8];
		
		while(fis.available() > 0) {
			int len = fis.read(bArr); // 읽고
			fos.write(bArr, 0, len); // 쓰고
		}
		fis.close();
		fos.close();
	}
}
