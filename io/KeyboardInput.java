package file.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardInput {

	public static void main(String[] args) throws Exception {
 
		String target = "D:\\helooo.txt";
		
		//FileWriter file = new FileWriter(target);
		
		PrintWriter out = new PrintWriter(new FileWriter("D:/heloo.txt"));

		
		InputStreamReader kb = new InputStreamReader(System.in);

		
		BufferedReader in = new BufferedReader(kb);

	
		String line = in.readLine();

		
		while (!line.equals("quit")) {
			out.print(line);
			line = in.readLine();
		}
		
		
		in.close();
		out.close();
		kb.close();
	}

}



