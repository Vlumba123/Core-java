package Excercise51;

public class Armstrong {
public static void main(String[] args) {
	int num=121, num1, rem, result=0;
	num1=num;
	while(num!=0) {
		rem=num%10;
		result+=Math.pow(rem, 3) ;
		num/=10;
	}
	if(result==num)
		System.out.println(num+"Number is armstrong");
	else 
		System.out.println("Number is not aemstrong");
	}
}

