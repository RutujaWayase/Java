package arrayProblems;

import java.util.Arrays;

public class SortingElementsInArray {
	public static void main(String[] args) {
		int a[] = {100, 600,200,400,500};
		System.out.println("Before sorting:");
	/*	
		for(int value:a) {
			System.out.println(value);
		}
	*/
		//instead we can use pre-defined class "Array" i.e. Arrays.toString()
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); // sort elements in array
		System.out.println(Arrays.toString(a));
	}

}
