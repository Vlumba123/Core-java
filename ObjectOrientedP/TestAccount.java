package ObjectOrientedP;

public class TestAccount {
	private static final int AccountBalance = 0;

	public static void main (String[] args){
		Account b = new Account();
		b.setNumber("884156416514499");
		b.setAccountType("Current Account");
		b.setBalance(5054.25);
		b.deposit(500.25);
		{
		}

		System.out.println("Account Balance: "+b.getBalance());
		b.withdrawal(160.25);

		System.out.println("Account Balance: "+b.getBalance());
		String c = b.getNumber();
		
		System.out.println("Account No: "+ b.getNumber());
		System.out.println("Account Type: "+b.getAccountType());
		
		System.out.println("Account Balance: "+b.getBalance());
		
		}

}
