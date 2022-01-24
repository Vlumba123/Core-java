package jdk8;

public class Test {
	
	public static void main(String[] args) {
		
		HelloInt hi = () -> {
			System.out.println("Hello say");
		};
		hi.Say();
	}

}
