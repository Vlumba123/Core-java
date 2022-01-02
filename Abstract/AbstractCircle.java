package Abstract;

public class AbstractCircle extends Shape {
 private int radius ;
	 
	 public AbstractCircle(int radius) {
		 this.radius=radius;
		  }
	 

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}
		 public double area () {
			 double arr = 3.14*radius*radius;
			 System.out.println("area of circle " + arr);
			 return arr;
		 }

}
