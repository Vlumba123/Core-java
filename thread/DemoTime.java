package thread;

public class DemoTime extends Thread{

	private String name;
	 
	public DemoTime (String n ) {
		name = n;
		
	}
	public void run() {
		
		for ( int i =0; i<50; i++) {
			try {
				Thread.sleep(1000);
			} catch ( InterruptedException e) {
		//
				//System.out.println(i + " " + name);
				e.printStackTrace();
		}
			System.out.println(i + " "+ name);
	}
	}
}

