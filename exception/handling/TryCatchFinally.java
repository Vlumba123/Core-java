package exception.handling;
 
public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			 
			try {
				 double t = 55/0;
				 System.out.println(t);
				  }
			 catch (ArithmeticException e) {
				 System.out.println("not divided");
				 }
			String s = "Java";
			
			System.out.println(s.charAt(6));
			
			
		}catch (StringIndexOutOfBoundsException e2) {
			System.out.println("Small length");
		}
		}
			//finally {
			//System.out.println("not done");
			//}
		
		
	

		}


	