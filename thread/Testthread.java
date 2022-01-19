package thread;

public class Testthread {
	public static void main(String[] args) {
		
		DemoThread t1 = new DemoThread ("Virat");
		DemoThread t2 = new DemoThread ("Rahul");
		DemoThread t3 = new DemoThread ("Dhoni");
		DemoThread t4 = new DemoThread ("Mayank");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
