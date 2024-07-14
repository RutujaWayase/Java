package oopsPolymorphismEncapsulation;

public class AdderPolymorphism {
	
	
	/*
	1)	Method name should be same.
	2)	Number of parameters should be different.
	3)	Data type of parameters should be different
	4)	Order of parameters should be different.
	*/
	

	
	int a=10, b=20;
	void sum() //1)Method name should be same.
	{
		System.out.println(a+b);
		
	}
	void sum(int x, int y) //1)Method name should be same.
	{
		System.out.println(x+y);
		
	}
	void sum(int x, double y) //1)Method name should be same.
	{
		System.out.println(x+y);
		
	}
	void sum(double x, int y) //1)Method name should be same.
	{
		System.out.println(x+y);
		
	}
	void sum(int a, int b, int c) //method overloading
	{
		System.out.println(a+b+c);
	}
	

}
