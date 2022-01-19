package file.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadAnObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file = new FileInputStream("d:/helloo.txt");
		ObjectInputStream in = new ObjectInputStream (file);
		
		Employee e = (Employee) in.readObject();
		
		System.out.println("ID: + e.getId()");
		System.out.println("Nmae: + e.getname()");
		System.out.println("Pwd: + e.getpwd()");
		
		
		
	}

}
