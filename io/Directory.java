package file.io;

import java.io.File;

public class Directory {
	public static void main(String[] args) {
		
		File directory = new File ("d:/") ;
		
		 String [] list = directory.list();
		 for (int i = 0; i <list.length; i++) {
			 System.out.println((i+1)+ " : "+ list[i]);
		 }
			
		 
		}
	}


