package ObjectOrientedP;

public class Account {

 private String number;
private String accountType;
private double balance;


public void setNumber (String number) {
	this.number = number;
}
public String getNumber() {
	return number;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType (String accountType) {
	this.accountType = accountType;
	
}
public void setBalance(double balance){
	
	this.balance = balance;
}
public double getBalance() {
	
	return balance;
}
public void withdrawal (double w) {
	balance = balance - w;
	System.out.println("Withdrawal from account is: "+ w);
}

public void deposit (double d) {
	balance = balance + d;
	System.out.println("The deposit in this account is: "+ d);
}

}
