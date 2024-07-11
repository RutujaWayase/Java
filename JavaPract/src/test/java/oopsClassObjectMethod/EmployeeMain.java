package oopsClassObjectMethod;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="John";
		emp1.job="SDET";
		emp1.sal=500000;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.eid=102;
		emp2.ename="David";
		emp2.job="SDE";
		emp2.sal=1000000;
		emp2.display();
	}



}
