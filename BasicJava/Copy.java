package BasicJava;

public class Copy {
public static void main(String[] args) {
	char[] aaa = {'a','b','c','d','e','f','g','h'};
	char[] bb = new char[4];
	System.arraycopy(aaa,1,bb,0,3);
	for (char cc : bb){
	System.out.println(cc);
}
}
}