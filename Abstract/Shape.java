package Abstract;

public abstract class Shape {
	private int borderwidth;
	private String color;

	//public static double pi =3.14; 
	
	public void setBorderWidth(int bw) {
		borderwidth = bw;
	}

	public int getBorderWidth() {
		return borderwidth;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double area() {
		return 5.2;
	}

}
