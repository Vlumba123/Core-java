package jdk8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ConcurrentCollection {
	
	
		public static void main(String[] args) {
			
			ArrayBlockingQueue<Integer> l = new ArrayBlockingQueue<Integer>(6);
			//SynchronousQueue<Integer> l = new SynchronousQueue<Integer>();
			l.add(55);
			l.add(48);
			l.add(87);
			l.add(897);
			
			System.out.println(l);
			
			Iterator it  = l.iterator();
			
			l.add(52);
			
			
			while (it.hasNext()) {
		//		IteratorExample o = it.next ();
				System.out.println(it.next());		
			}
		}

	}
	


