package exception.handling;

public class CatchWithoutTry {
	public static void main(String[] args) {
		int k=0;
		int i =20;
		 
		double div = i/k;
		System.out.println("Div is "+ div);
		try {}
		
		catch (ArithmeticException e) {
			System.err.println(" Not Divided by zero");
		}
		
			finally {
				System.out.println("done");
			}
		}
	


	
}
