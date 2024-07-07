package VariablesDatatypes;

public class Variables {
	
	public static void main(String[] args) {
		//int a; //declaration
		//a =100; //assignment
		/*
		int a =100;
		System.out.println(a);
		*/
		
		//Approach 1 - - Applicable if all the variables belong to different data types
		/*
		int a=100;
		int b=200;
		int c=300;
		*/
		
		//Approach 2 - Applicable if all the variables belong to same data type
		/*
		int a, b, c;
		a=100;
		b=200;
		c=300;
		*/
		
		//Approach 3 - Applicable if all the variables belong to same data type
		int a=100, b=200, c=300;
		
		System.out.println("the value of a: "+ a); //'+" is concatenation operator
		System.out.println("the value of b: "+b);
		System.out.println("the value of c: "+c);
		
		System.out.println(a+ " "+b+ " "+c); //to print all elements in single line - concatenate it with space else it will return total value
		
	}



}
