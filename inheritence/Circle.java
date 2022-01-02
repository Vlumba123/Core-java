package inheritence;

public class Circle extends GetSet{
	 private int radius ;
	 
	 public Circle(int radius) {
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



