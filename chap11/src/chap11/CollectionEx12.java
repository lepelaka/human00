package chap11;

import java.util.Enumeration;
import java.util.Properties;

public class CollectionEx12 {
	public static void main(String[] args) {
		// Hashtable Legacyclass
		Properties props = new Properties();
		props.setProperty("a", "12345");
		props.put("b", "5667");
		System.out.println(props);
		
		props = System.getProperties();
		
		props.forEach((k, v) -> System.out.println(k + " : " + v ));
		Enumeration<Object> e = props.keys();
		System.out.println(e);
		while(e.hasMoreElements()) {
			String key = e.nextElement().toString();
			String value = props.get(key).toString();
			
			System.out.println(key + " : " + value);
		}
	}
}
