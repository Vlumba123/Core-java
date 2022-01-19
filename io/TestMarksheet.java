package file.io;

public class TestMarksheet {
	
	 public static void main(String[] args) {
			Marksheet mark = new Marksheet("vishu",75,65,65);
			
			Marksheet newmark = null;
			
			
			
			System.out.println(mark.getName());
			System.out.println(mark.getMaths());
			System.out.println(mark.getPhysics());
			System.out.println(mark.getChemistry());
			System.out.println(mark.getTemp());
					
		}
	}


