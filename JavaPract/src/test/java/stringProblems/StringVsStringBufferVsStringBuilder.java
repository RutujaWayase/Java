package stringProblems;

public class StringVsStringBufferVsStringBuilder {
	
	public static void main(String[] args) {
		
		//String - immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s); //immutable cannot change original value
		
		//StringBuffer - mutable
		StringBuffer s1 = new StringBuffer("welcome");
		s1.append("to java");
		System.out.println(s1); //welcometo java //mutable we can change original value of the variable
		
		//StringBuilder - mutable
		StringBuilder s2 = new StringBuilder("welcome");
		s2.append("to java");
		System.out.println(s2); //welcometo java //mutable we can change original value of the variable
		
		
	}

}
