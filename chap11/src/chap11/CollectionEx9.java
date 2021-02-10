package chap11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEx9 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(100);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(10);
		set1.add(52);
		set1.add(6);
		set1.add(72);
		set1.add(8);
		set1.add(2);
		
		System.out.println(set1);
		
		TreeSet<Integer> set2 = new TreeSet<>(set1);
		System.out.println(set2);

		Set<Person> persons = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
			}
			
		});
//		System.out.println(persons);
		persons.add(new Person("둘리", 20));
		persons.add(new Person("고길동", 40));
		persons.add(new Person("희동이", 10));
		persons.add(new Person("또치", 25));
		System.out.println(persons);
		
	}
}
