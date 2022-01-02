package interface1;

public class Person1 {
	
	private String firstname;
	private String lastname;
	private String address;
	
	public Person1() {
		System.out.println("Person1 Default Constructor");
		
	}
public Person1(String fn, String ln) {
	this();
	firstname = fn;
	lastname = ln;
	System.out.println( "Person1 2 Parameterized constructor");
	
System.out.println("firstname"+ fn);
System.out.println("lastname"+ ln);
}
	public Person1(String fn, String ln, String add ) {
		this(fn,ln);
		
		address = add;
		System.out.println(" Person1 3 Parameterized constructor" + fn +  " "+ ln );
	}
	public static void main(String[] args) {
		Person1 p =new Person1("Rays","Tech","Indore");
		 System.out.println();
	}
	

	}


