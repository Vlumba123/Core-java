package thread;

public class HelloThread  implements Runnable	{

	private String name;
	 
	public HelloThread (String n ) {
		name = n;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i =0; i<50; i++) {
			System.out.println(i + " "+ name);
		}
	}
	}
	