package Stream;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contestant {
	

	 public String phone ;
	 public String name ;
	 
	 public Contestant (String n, String p) {
		 name =n;
		 phone =p;
	 }
	 public static void main(String[] args) {
		
	 ArrayList<Contestant> list  = new ArrayList<Contestant>();
	 
          list.add(new Contestant("Ram","9874563210")); 
          list.add(new Contestant("Sham","9597499655")); 
          list.add(new Contestant("Dheeraj","987")); 
          list.add(new Contestant("Vineet","9811144785")); 
          list.add(new Contestant("Vishu","93214569")); 
          list.add(new Contestant("Rohan","7895541203")); 
          list.add(new Contestant("Mayank","9846532710")); 
      
          list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct()
          .collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
        	  Collections.shuffle(e);
        	  return e.stream();
          })).limit(3).forEach(e -> System.out.println(e));
          
          }
	 
}

