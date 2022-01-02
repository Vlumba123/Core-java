package Abstract;

public class AbstractRectangleTest {
	
	public static void main(String[] args) {
		
		Shape pr = new AbstractRectangle (7,9) {
		};
		 double r = pr.area() ;
				 
			 System.out.println(" the area is  "  + r ) ;
		
		}
	
	}

