package Abstract;

public  abstract class AbstractRectangle extends Shape {
	 public int length;
	 public int breadth;
	 
	 
	 public AbstractRectangle() {}
	 
	 public AbstractRectangle( int length, int breadth) {
		 this.length= length;
		 this.breadth= breadth;
	 }

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

public double area () {
	return length*breadth;
}

	 
}
