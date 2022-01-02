
package exception.handling;

public class TestAccount {
	public static void main(String[] args) {
		Account h = new Account ();
		
		h.setType("Current");
		h.setNumber("48795426544865");
		System.out.println(h.getType());
		System.out.println(h.getNumber());
		
	
	try {
		h.setBalance(5500);
		h.withdrawl(5100);
		auth(h.getBalance());
	 System.out.println();	
	}
	catch (Insufficientfund e) {
		System.out.println("Insufficientfund");
	}
	}
public static void auth (double balance) throws Insufficientfund{
if (balance<500) {
	Insufficientfund f = new Insufficientfund ();
	throw f;
}
}
}