package BasicJava;

public class ReverseSAME {
public static void main(String[] args) {
	String name = "vijay dinanath chouhan";
	String [] name1 = name.split(" ");
	System.out.println( "reverse String");
	String a = name1[0];
	String [] b= a.split("");
	for (int i= (a.length()-1); i>=0; i--) {
		System.out.print(b[i]);
	}
	System.out.print(" ");
	String a1 = name1[1];
	String []b1 = a1.split("");
	for (int i=(a1.length()-1); i>=0;i--) {
		System.out.print(b[i]);
	}
	
	}
}

