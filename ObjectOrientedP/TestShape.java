package ObjectOrientedP;

import inheritence.GetSet;

public class TestShape {
public static void main(String[] args) {
	
	GetSet so = new GetSet();
	//Shape s = new Shape () ;
		so.setBorderWidth (4);
		so.setColor("Red");
		
		String c = so.getColor();
		
		System.out.println(c);
		System.out.println(so.getBorderWidth());


}
}

