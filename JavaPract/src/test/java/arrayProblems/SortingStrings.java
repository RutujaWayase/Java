package arrayProblems;

import java.util.Arrays;

public class SortingStrings {
	public static void main(String[] args) {
		
		//char s[] = {'D', 'C', 'A', 'B'};
		String s[] = {"john", "David", "Marray", "scott"};
		
		System.out.println("before sorting:"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sorting:"+Arrays.toString(s));
		
	}

}
