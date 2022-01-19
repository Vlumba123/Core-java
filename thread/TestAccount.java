package thread;

public class TestAccount extends Thread {
	
	public static Account acc = new Account ();
	 private String name ;
	 
	  public TestAccount (String n) {
		  this.name = n;
	  }
	
	public void run() {
		for (int i = 0; i<5; i++) {
		try {
			acc.deposit (name,1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		TestAccount t1 = new TestAccount ("Ram");
		TestAccount t2 = new TestAccount ("Shyam");
		
		t1.start();
		t2.start();
		
	}
}
