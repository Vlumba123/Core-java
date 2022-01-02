package collection.java;

import java.util.List;
import java.util.ArrayList;

public class TestCollection {
	
	public static void main(String[] args) {
		List l = new ArrayList <> ();
		l.add(14);
		l.add('G');
		l.add("java");
		l.add(4.87);
		System.out.println(l);
		System.out.println(l.size());
	
	for 
	(Object o : l) {
	System.out.println(o);
	}
	
List b = new ArrayList <> ();
b.add(55);
b.add('h');
b.add("rays");
b.add(5.8);
b.addAll(l);


System.out.println(b);

	l.clear();
	System.out.println(l);
	
	l.contains('G');

System.out.println(l.contains('G'));
	
	l.containsAll(b);
	System.out.println(l.containsAll(b));
	
l.isEmpty();
System.out.println(l.isEmpty());
	
}
}
	







