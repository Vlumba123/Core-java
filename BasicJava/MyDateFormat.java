package BasicJava;


import java.text.ParseException;
import java.text.SimpleDateFormat ;

import java.util.Date;

public class MyDateFormat {
	
	public static void main(String[] args) throws ParseException  {
		Date d= new Date();
		
	SimpleDateFormat Sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	String dt = Sdf.format(d);
	
	System.out.println(dt);
	
	String s = "05/12/2021" ;
	Date dd = Sdf.parse(s);
	System.out.println(dd);
	
	
	}
	

	}


