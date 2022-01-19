package file.io;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;

	public class TestDeserialize {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			
			FileInputStream file = new FileInputStream("d:/helloo.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			
			Employee e = new Employee (1,"rays","byius");
			in.read();
			in.close();
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getPwd());
			
			
			
		}

	}



