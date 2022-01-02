package inheritence;

public class Addition {

	public void add(int a, int b) {
		System.out.println( a+b);
	}
	 
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	public double add (double a, int b) {

	System.out.println(a+b);
	return a+b;
	}
	
	public static void main(String[] args) {
		
	
		Addition a = new Addition ();
		a.add(5, 8);
		a.add(8, 15, 57);
		a.add(5.8, 7);
	} 
	 
	
		
}
