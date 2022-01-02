package inheritence;

public class ReturnTest {

	public static GetSet getShape(int p) {

		if (p == 1) {
			return new Rectangle(5, 9);
		}

		if (p == 2) {
			return new Circle(5);
		}

		if (p == 3) {
			return new TriangleClass(7, 9);
		}
		return null;
	}

	public static void main(String[] args) {

		GetSet op = getShape(4);

		System.out.println(op.area());

	}
}
