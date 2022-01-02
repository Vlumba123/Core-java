package inheritence;

public class TestArray {
	public static void main(String[] args) {
	
		GetSet s[] = new GetSet[3];
		s[0] = new Rectangle(4,5);
		s[1] = new Circle(5);
		s[2] = new TriangleClass(4,6);
		
		double arr = calArea(s);
		System.out.println(arr);
	}
		public static double calArea(GetSet[] s) {
			double arr =0;
			
			for (int i = 0; i<s.length; i++) {
			arr = arr + s[i].area();
			}
			return arr;
			
		
	}

}
