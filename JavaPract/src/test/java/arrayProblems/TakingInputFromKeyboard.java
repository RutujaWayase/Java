package arrayProblems;

import java.util.Scanner;

public class TakingInputFromKeyboard {
	
	public static void main(String[] args) {
		//int num =20; //hard coded value
		
		Scanner sc = new Scanner(System.in); //Scanner is used to take input from user/keyboard
		
		//number
	/*	
		System.out.println("Enter a number:");
		
		int num = sc.nextInt(); //nexInt() accepts numeric data only
		
		System.out.println(num);
	*/
		
		//decimal number
	/*
		System.out.println("Enter decimal number:");
		double num = sc.nextDouble();
		System.out.println("Given value is: "+num);
	*/
		
		//Integer data type variables can not hold decimals. Whereas Decimal data type variables can hold integers
		
		//String
		System.out.println("Enter you city: ");
		String city=sc.next(); //next() is used for string
		System.out.println("Your city is: "+city);
		
	}

}
