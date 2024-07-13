 package JavaPograms;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before swapping values are: "+a+ " "+b);
		
		//logic 1 - third value
	/*	
		int t=a;
		a=b;
		b=t;
	
		System.out.println("After swapping values are: "+a+ " "+b);
		
		
	*/
		//logic 2 - use + & - without using third variable
	/*
		a=a+b; //10+20=30
		b=a-b; //30-20=10;
		a=a-b; //30-10=20
		System.out.println("After swapping values are: "+a+ " "+b);
	*/
		//logic 3 - use * & / without using third variable
		//here a & b values should not be zero
	/*
		a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20
		System.out.println("After swapping values are: "+a+ " "+b);
	*/	
		//logic 4 - bitwise XOR (^)
	/*
		a=a^b; //1010 ^ 10100 = 11110 = 30
		b=a^b; //11110 ^ 10100 = 1010 = 10
		a=a^b; //11110 ^ 1010 = 10100 = 20
		System.out.println("After swapping values are: "+a+ " "+b);
	*/
		//logic 5 - Single statement
		//a=10, b=20
		
		b=(a+b)- (a=b); // execution starts from right to left
		System.out.println("After swapping values are: "+a+ " "+b);
	
		
	}

}
