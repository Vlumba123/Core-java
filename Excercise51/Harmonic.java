package Excercise51;

public class Harmonic {

	 public static void main(String[] args) 
	    {
	   int num = 5;
	   
	        float result = 0.0f;
	 
	        System.out.println("The harmonic series is: ");
	 
	       
	        for (int i = num; i > 0; i--) {
	 
	           
	            result = result + (float)1 / i;
	            System.out.print(result + ", ");
	        }
	    
	    }
	}
