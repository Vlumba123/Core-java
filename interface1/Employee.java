package interface1;

public class Employee extends Person1 {
	 
	private String designation;
	 public Employee() {
		 System.out.println(" Default constructor for Employee");
		 
	 }
	  public Employee(String fn, String ln, String des) {
		  super (fn,ln);
		  designation = des;
		  System.out.println("Employee 3 parameterized" + " " + fn +" " +ln+" "+ des);
		 //System.out.println("first name " + fn);
		// System.out.println("last name "+ ln);
		System.out.println("Designation" + des);
	  }
	  
	public static void main(String[] args) {
		 Employee E = new Employee("Vijay","Chauhan", "Devloper");
				 
	}
	
}
