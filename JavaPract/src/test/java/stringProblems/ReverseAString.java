package stringProblems;

public class ReverseAString {
	public static void main(String[] args) {
		
		//Approarch1
		
		String s ="welcome";;
		String rev = "";
		
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse string:");
		//System.out.println();
	}

}
