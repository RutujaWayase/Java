package JavaPograms;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
	/*	
		//1.using algorithm
		int rev=0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse number is: "+ rev);
		
	*/
	
	/*	
		//2. Using StringBuffer class
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse Number is: "+ rev);
	*/
		//3. Using StringBuilder class
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev = sb1.reverse();
		System.out.println("Reverse Number is: "+ rev);
	}

}
