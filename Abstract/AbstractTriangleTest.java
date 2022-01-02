
package Abstract;


public class AbstractTriangleTest {
	
	public static void main(String[] args) {

		Shape ab = new AbstractTriangle(4,5) {
		
		} ;
		
	double p = 	ab.area();
	
	System.out.println(" the area is  "  + p);
	
	}
}

