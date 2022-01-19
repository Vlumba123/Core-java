package thread;

import javax.imageio.IIOException;

public class DemoThread extends Thread{
	 
	private String name;
	 
	public DemoThread (String n ) {
		name = n;
		
	}
	@Override
	public void run() {
		
		for ( int i =0; i<5; i++) {
    System.out.println(i + " " + name);
		
		}
		
	}
}

