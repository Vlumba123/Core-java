package file.io;

public class CheckEmail {

	public static void main(String[] args) {

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String ro = "vishu@gmail.com";

		System.out.println(ro.matches(emailreg));
	}
}
