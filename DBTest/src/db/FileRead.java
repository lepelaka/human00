package db;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("c:\\users\\user\\익스포트.csv"));
		String s = null;
		while((s = br.readLine()) != null) {
			String[] arr = s.split(",");
			for(String str : arr) {
				System.out.println(str.replace("\"", ""));
			}
		}
	}
}
