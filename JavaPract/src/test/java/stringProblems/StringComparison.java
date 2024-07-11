package stringProblems;

public class StringComparison {
	
	public static void main(String[] args) {
		
		/*
		1) == equals()
		2) String s="welcome"
		String s = new String("welcome");
		*/
		
		// '==' is used to compare the objects
		// '.equal()' method is used to compare values of the objects 
		
		//Case 1
	/*	
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); //true
	*/
		
		//Case 2
		String s1 = new String("welcome");
		String s2 = new String("welcome");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2); //false //to compare the objects
		System.out.println(s1.equals(s2)); //true //to compare values of the objects
		
		//Case 3
		String s11="abc";
		String s22=new String("abc");
		
		System.out.println(s11==s22); //false
		System.out.println(s11.equals(s22)); //true
		
		//Case 4
		String a1="abc";
		String a2=new String("abc");
		String a3=a2;
		
		System.out.println(a1==a2);//false
		System.out.println(a1.equals(a2));//true
		System.out.println(a2==a3);//true, objects are same/equal
		System.out.println(a2.equals(a3)); //ture
		System.out.println(a1==a3);//false
		System.out.println(a1.equals(a3));//true
		
		
	}
	

}
