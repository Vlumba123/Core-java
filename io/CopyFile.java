package file.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String[] args) throws IOException {
		String source = "D:\\helooo.txt";
		String target ="D:\\hiiii.txt";
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);
		
		int ch = reader.read();
		while (ch!= -1) {
			writer.write(ch);
			ch = reader.read();
		}
		writer.close();
		reader.close();
	//	System.out.println(source + "is copied to " + target);
		
	}

}
