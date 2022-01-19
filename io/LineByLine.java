package file.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineByLine {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:\\vishu.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
	while (line!= null) {
		System.out.println(line);
		line= br.readLine();
		
	}
	reader.close();

}
}
