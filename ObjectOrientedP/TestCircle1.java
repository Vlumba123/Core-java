package ObjectOrientedP;

import inheritence.GetSet;

public class TestCircle1 {
public static void main(String[] args) {
	 GetSet c = new ConstructorCircle (6);
	 
	  c.setBorderWidth(8);
	  c.setColor("Red");
	   
	  c.area();
	  
	  System.out.println(c.getBorderWidth());
	  System.out.println(c.getColor());
	  		
	 
	 
}
}
