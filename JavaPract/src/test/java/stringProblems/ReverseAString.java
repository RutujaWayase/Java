package stringProblems;

public class ReverseAString {
	public static void main(String[] args) {
		
		//Approarch1 - length(), charAt()
	/*	
		String s ="welcome";;
		String rev = "";
		
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse string:");
		//System.out.println();
	*/
		
		
		//Approach2 - without using string methods - by converting string to char array type
	/*	
		String s="welcome";
		String rev="";
		char a[] = s.toCharArray();
		for(int i=a.length-1; i>=0; i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse string is:"+rev);
		
	*/
		//StringBuffer
		//StringBuilder
	
		/*
		StringBuffer a = new StringBuffer("welcome");
		StringBuilder a = new StringBuilder("welcome");
		*/
		
		
		//Approach3: using StringBuffer class
		StringBuffer s = new StringBuffer("welcome");
		
		System.out.println(s);
		
		System.out.println("Reverse string is:"+ s.reverse());
		
		//Approach4: using StringBuilder class
		StringBuilder s1 = new StringBuilder("welcome");
		System.out.println("Reverse string is:"+ s.reverse());
		
	}

}
