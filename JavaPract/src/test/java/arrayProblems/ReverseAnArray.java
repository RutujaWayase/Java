package arrayProblems;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		int a[] = {100,200, 300, 400, 500};
		
		//here enhance for loop will not work as it will read all elements one by one
		//using normal for loop
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}

}
