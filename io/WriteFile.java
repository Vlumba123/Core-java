package file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		 FileWriter writer = new FileWriter("d:/helooo.txt");
		 
		 PrintWriter pw = new PrintWriter(writer);
		  
		// BufferedWriter bw = new BufferedWriter (writer);
		
		 
		
			 pw.println( "Vishu ");
			 pw.println( "Rahul ");
			 pw.println( "Rohan ");
			 pw.println( "Mayank");
		 
		 pw.close();
		 writer.close();
		 System.out.println("done");
	}

}
