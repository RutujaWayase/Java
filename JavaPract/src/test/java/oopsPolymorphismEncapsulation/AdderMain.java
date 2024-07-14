package oopsPolymorphismEncapsulation;

//this is called method overloading
//method overloading is an example of polymorphism
public class AdderMain {
	
	public static void main(String[] args) {
		
		AdderPolymorphism addobj = new AdderPolymorphism();
		addobj.sum();
		
		addobj.sum(100,200);
		
		addobj.sum(10.5, 20);
		
		addobj.sum(10, 15.5);
		
		addobj.sum(10, 20, 30);
		
		//addobj.sum(10.5, 20.5, 30.5); //invalid
		
	}

}
