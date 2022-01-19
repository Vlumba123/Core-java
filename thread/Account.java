package thread;

public class Account {
	private int balance= 0;
	
	public synchronized void deposit (String msg, int amount ) throws InterruptedException  {
		{
		int bal = getBalance();
		setBalance(bal+amount);
		}
		System.out.println(msg + " " + getBalance());
		
		
}

	private void setBalance(int balance) {
		this.balance =balance;
		
	}

	private int getBalance() throws InterruptedException {
		Thread.sleep(200);
		return balance;
	}

}
