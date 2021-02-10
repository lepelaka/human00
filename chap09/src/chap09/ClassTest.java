package chap09;

import java.lang.reflect.Field;

public class ClassTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Addr addr = new Addr("지연우", "010-0000-0000"); // Addr클래스의 인스턴스 생성
		
		Class<?> cls1 = addr.getClass(); // Class클래스의 인스턴스 생성
		System.out.println(cls1.getName());
		Addr addr2 =  (Addr)cls1.newInstance();
		
		
		System.out.println(addr); // 
		System.out.println(addr2);
		
		Class<?> cls2 = Addr.class;
		Addr addr3 = (Addr) cls2.newInstance();
		System.out.println(addr3);
		
		Class<?> cls3 = Class.forName("chap09.Addr");
		Addr addr4 = (Addr) cls3.newInstance();
		
		System.out.println(addr4);
		
		Field[] fields = cls1.getFields();
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		String str = "abc";
		str += "def";
		System.out.println(str);
		
	}
}
