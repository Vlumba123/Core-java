package file.io;

import java.io.File;
import java.util.Date;

public class File5 {
	public static void main(String[] args) {
		
	
File directory = new File("d:/");

File [] list = directory.listFiles();

for (int i =0; i<list.length; i++) {
	
	 if(list [i].isFile()) {
System.out.println((i+1) + " : "+ list[i].getName());


	}	 
}
	}
}
