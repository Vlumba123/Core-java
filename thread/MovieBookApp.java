package thread;

public class MovieBookApp {
	public static void main(String[] args) {
		
		TotalEarnings te = new TotalEarnings();
		te.start();
		//System.out.println("TotalEarnings"+" "+ te.total+ "rs");
		
		synchronized (te) {
			try {
				te.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("TotalEarning"+ " "+ te.total+ "rs");
		}
	}

}
