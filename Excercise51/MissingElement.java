package Excercise51;

public class MissingElement {
	static void findMissing (int a[], int b[], int n, int m) {
 for (int i =0; i<n; i++) {
	 int j;
	  for (j=0; j<m; j++) 
		  if (a[i]==b[j])
			  break;
	  
		  if (j==n)
			  System.out.println(a[i] + " ");
	  }
 }
	public static void main(String[] args) {
		 
		 
		 int a[] = {12,15,14,78,45,18};
	
		 int  b[] ={15,12,14,78,45};
		
		 int n= a.length;
		 int m= b.length;
		  
		 findMissing(a,b,n,m) ;
	}

}
