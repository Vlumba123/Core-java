package exception.handling;

public class FinallyTryCatch {
	public static void main(String[] args) {
		int k=0;
		int i =20;
		try {
			double div = i/k;
			System.out.println("Div is "+ div);
		}
		catch (ArithmeticException e) {
			System.err.println(" Not Divided by zero");
		}
		
			finally {
				System.out.println("not find");
					try {
						String s= "Rays";
						
						System.out.println(s.length());
						System.out.println(s.charAt(5));
					
					} catch (IndexOutOfBoundsException e) {
					System.out.println("Sting not match");
					}
				}
			}
		
}

	


