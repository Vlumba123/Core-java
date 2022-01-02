package BasicJava;
 
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeOfEmployee {
	public static void main(String[] args) {
		 LocalDate today = LocalDate.now();
		 LocalDate birthDate= LocalDate.of(1998,9,28);
		int years = Period.between(birthDate, today).getYears();
		
	System.out.println(today);
		 System.out.println(birthDate);
		 System.out.println(years);
	}
	

}
