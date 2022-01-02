package Abstract;

public abstract class AbstractTriangle extends Shape {
	private int base;
	private int height;

	public AbstractTriangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	//public void setBase(int base) {
	//	this.base = base;
	//}

	public int getHeight() {
		return height;
	}

	//public void setHeight(int height) {
	//	this.height = height;
	//}

	public double area() {
		return 0.5*base*height;

	}

}
