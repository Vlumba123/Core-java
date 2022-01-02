package inheritence;

public class GetSet {
	private int borderwidth;
	private String color;

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
		return 0;
	}
}