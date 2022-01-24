package jdk8;

public class AddtionTest {
	public static void main(String[] args) {
		
		Addition a1 = (a , b) -> {
			return a+b;
			}; 
			
			int c=a1.add(5,10);
			System.out.println(c);
			a1.defMethod();
			Addition.staticMethod();
			
	}

}
