package arrayProblems;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ex1:
	/*	
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Addition of two numbers:"+ (num1+num2));
	*/
		
		//Ex2:
	/*	
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("your name is: "+ name);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("your age is: "+age);
	*/	
		//for unknown value
		System.out.println("Enter unkown value:");
		Object value = sc.next(); //next() accepts all type of values and consider it as sting
		System.out.println(value);
		
	}

}
