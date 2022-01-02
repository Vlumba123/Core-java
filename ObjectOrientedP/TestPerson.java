package ObjectOrientedP;


	
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class TestPerson {
		public static void main (String[] args) throws ParseException {
			Person p = new Person();
			

		
		Date d = new Date();
			
			System.out.println(d);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String dt = sdf.format(d);

			
			p.setName("Vishu");
			
			p.setAddress("Vasant Vihar");
		
			p.setDob(sdf.parse("07/08/1994"));
			String c = p.getName();
			System.out.println(p);
			System.out.println(p.getName());
		
			System.out.println(p.getDob());
			System.out.println(p.getAddress());
			
			}
	}

	


