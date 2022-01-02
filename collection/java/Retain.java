package collection.java;

import java.util.ArrayList;
import java.util.List;

public class Retain {
	public static void main(String[] args) {
		List l = new ArrayList <> ();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		//System.out.println(l);
		//System.out.println(l.size());
	
		List b = new ArrayList <> ();
		b.add(1);
		b.add(2);
		b.add(55);
		b.add(48);
		//System.out.println(l);
		//System.out.println(b.size());
		System.out.println(l);
		System.out.println(b);
		System.out.println(b.retainAll(l));
		System.out.println(l);
		System.out.println(b);
	}
	}

