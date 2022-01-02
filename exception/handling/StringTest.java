package exception.handling;

public class StringTest {
	public static void main(String[] args) {
		try {
		String s= "Rays";
		
		System.out.println(s.length());
		System.out.println(s.charAt(5));
	
	} catch (IndexOutOfBoundsException e) {
	System.out.println("Sting not match");
}
		finally {
			System.out.println("This is not done");
		}
}
}