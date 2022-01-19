package thread;

public class DemoPriroty {

	public static void main(String[] args) {

		 DemoThread t1 = new DemoThread ("Vishal");
		 DemoThread t2 = new DemoThread ("Vishu");
		 
		 Thread th =  new Thread(t1);
		 Thread tt =  new Thread(t2);
		 
		 th.start();
		 tt.start();
		  
		 th.setPriority(10);
		 tt.setPriority(1);
		 
	}
		
	}


