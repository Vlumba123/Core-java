package collection.java;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
	public static void main(String[] args) {
		List l = new ArrayList <> ();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);

		List b = new ArrayList <> ();
		b.add(1);
		b.add(2);
		b.add(55);
		b.add(48);
		System.out.println(l.removeAll(b));
		System.out.println(l);
	}
	


}
