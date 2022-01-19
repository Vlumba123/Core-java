package file.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSearalize {
public static void main(String[] args) throws IOException {
	
	FileOutputStream file = new FileOutputStream ("d:/helloo.txt");
	ObjectOutputStream Out = new ObjectOutputStream(file);
	
	 Employee e = new Employee (1,"Rays","hws");
	 Out.writeObject(e);
	 Out.close();
	 System.out.println("object is successfully persisted");
}


	}

