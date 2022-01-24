package jdk8;

import java.util.ArrayList;
import java.util.List;

public class LIst {
	

	public static void main(String[] args) {
		List l = new ArrayList <> ();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		l.forEach(li -> System.out.println(li));

	}
}
