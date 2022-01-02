package inheritence;

public class TriangleClass extends GetSet {
  private int base;
  private int height ;
  
  public TriangleClass (int base, int height) {
  this.base=base;
  this.height=height;
  }
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
  public double area () {
	  double ar = 0.5*(base*height) ;
	  System.out.println("area of triangle"+ar);
	  return ar;
	  
  }
  
  
 
}
