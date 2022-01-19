package file.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Append {
	public static void main(String[] args) throws IOException {
		 FileWriter writer = new FileWriter("d:/helooo.txt",true);
		 
		 PrintWriter pw = new PrintWriter(writer);
		  
			 for(int i =0; i<1; i++) {
			 pw.println(i + ":Vishu ");
			 pw.println(i + ":Rahul ");
			 pw.println(i + ":Rohan ");
			 pw.println(i + ":Mayank");
			 pw.println(i + "Vishal");
		 }
		 pw.close();
		 writer.close();
		 System.out.println("done");
	}

	
		
	}
	
		
	

	
		





