package excercise126;

public class Employee {
	
	final int adharNumber;
	
	public Employee( int adharNumber) {
		this.adharNumber=adharNumber;
		
	}
	public int getadharNumber() {
		return adharNumber;
		
	}
public static void main(String[] args) {
	Employee e = new Employee (355545566);
	 int  R = e.getadharNumber();

	
	
System.out.println("AdharNumber:"+" "+ R);

}
}

