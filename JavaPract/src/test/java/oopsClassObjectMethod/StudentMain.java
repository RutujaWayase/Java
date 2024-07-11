package oopsClassObjectMethod;

public class StudentMain {
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.sid=101;
		stud1.sname="smith";
		stud1.grad='A';
		stud1.printData();
		
		Student stud2 = new Student();
		stud2.sid=102;
		stud2.sname="mark";
		stud2.grad='B';
		stud2.printData();
	}

}
