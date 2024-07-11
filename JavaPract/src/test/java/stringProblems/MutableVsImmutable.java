package stringProblems;

import java.util.Arrays;

public class MutableVsImmutable {
	
	public static void main(String[] args) {
		
		//Immutable - we cannot change
		//mutable - we can change
		
		//mutable
	/*	
		int a[] = {20,90,80,60,50};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //mutable - we can change
		System.out.println(Arrays.toString(a));
	*/	
		//immutable
		String s = new String("welcome");
		System.out.println(s);
		String concatstring = s.concat("to java");
		System.out.println(s); //welcome -> immutable - we cannot change value
		System.out.println(concatstring);
		
		//Strings are Immutable in java
		
		//String - Immutable, can not change
		//StringBuffer - mutable, can change
		//StringBuffer - mutable, can change
		
	}

}
