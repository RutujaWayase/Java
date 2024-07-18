package oopsThisStaticKeywords;


/*
this Keyword

2 types of variables
1) class varibles/instance variables
2) local variables
*/

public class ThisKeyword {
	int x,y; //class variables/instance variables
	
	/*
	ThisKeyword(int x, int y){  //constructor
		this.x=x; //this represents the class
		this.y=y;
	}
	*/
	
	//method
/*	
	void setData(int a, int b) {//method
		x=a;
		y=b;
	}
*/
	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		//constructor
		//ThisKeyword th = new ThisKeyword(100,200);
		//th.display
		
		//method
		ThisKeyword th = new ThisKeyword();
		th.setData(100, 200);
		th.display();
		
	}

}
