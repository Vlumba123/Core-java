package exception.handling;

public class Test {
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
				System.out.println("done");
			}
		}
	}


