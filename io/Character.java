package file.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Character {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:\\helooo.txt");
		int ch = reader.read();
		char chr;
		
		while (ch!=-1) {
			chr= (char)ch;
			System.out.println(chr);
			ch= reader.read();
		}
	}

}


