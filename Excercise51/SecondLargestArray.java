package Excercise51;

public class SecondLargestArray {

	public static int getSecondLargest(int [] a, int total) {
         int box;

for (int i=0; i<total;i++) {
	
	for (int j=i+1; j<total;j++)

	{
		if (a[i]>a[j]) 
		{
			box = a[i];
			a[i]= a[j];
			a[j]= box;
			
		}
	}
}
  return a[total-2] ;
	}
	public static void main(String[] args) {
		int a []= {5,10,3,19,30};
		System.out.println("Second Largest "+ getSecondLargest(a,5));
	}
	}

