package chap11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CollectionEx10 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("A", "홍길동");
		map.put("A", "홍길동");
		map.put("A", "홍길동");
		map.put("A", "홍길동");
		
//		System.out.println(map);
		map.put("A", "고길동");
		map.put("B", "둘리");
		map.put("C", "희동이");
//		System.out.println(map);
		
//		System.out.println(map.get("A"));
//		System.out.println(map.get("D"));
//		
		
		// 회원
		// 아이디, 비밀번호, 이름, 전화번호, 생년월일, 이메일
		
		HashMap<String, String> member = new HashMap<>();
		member.put("id", "go");
		member.put("pw", "1234");
		member.put("name", "고길동");
		member.put("phone", "1111-1111");
		member.put("birth", "19800101");
		member.put("email", "go@naver.com");

		HashMap<String, String> member2= new HashMap<>();
		member2.put("id", "duli");
		member2.put("pw", "1234");
		member2.put("name", "둘리");
		member2.put("phone", "2222-2222");
		member2.put("birth", "19900505");
		member2.put("email", "duli@gmail.com");
		
//		System.out.println(member);
//		System.out.println(member2);
		
		ArrayList<HashMap<String, String>> members = new ArrayList<>();
		members.add(member);
		members.add(member2);
		
//		System.out.println(members);
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하세요 >");
			String id = scanner.nextLine();
			System.out.print("비밀번호를 입력하세요 >");
			String pw = scanner.nextLine();
			
			// 아이디가 없을때
			// 아이디는 있는데 비밀번호와 맞지 않을때
			// 아이디가 있고 비밀번호와 일치 할때 >> 
			boolean exist = false;
			for(int i = 0 ; i < members.size() ; i++) {
				if(members.get(i).get("id").equals(id)) { // 아이디가 존재할 때
					exist = true;
					if(members.get(i).get("pw").equals(pw)) { // 비밀번호가 일치 할 때
						System.out.println(members.get(i).get("name") + "님 환영합니다.");
					}
					else { // 비밀번호 불일치
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
			}
			if(!exist) System.out.println("아이디가 존재하지 않습니다");
		}
		
		
		
	}
}
