package operatorsExpressions;

public class Operators {
	
	public static void main(String[] args) {
		
		//1)Arithmetic operators + - * / %
		int a=20, b=10;
		
		int result=a+b;
		
		System.out.println("Sum of a and b is"+ result);
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is: "+(a/b));
		System.out.println("Modulus of a and b is:"+(a%b));
		
		//2)Relational/comparison operator > >= < <= != ==
		//returns boolean value -true/false
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		b=20;
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		boolean res=a>b;
		System.out.println(res);
		
		//3)Logical operators && || 
		//
	}

}
