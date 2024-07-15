package oopsPolymorphismEncapsulation;

//Encapsulation

public class Account {
	
	/*
	int accno;
	String name;
	double amount;
	*/
	private int accno;
	private String name;
	private double amount;
	//Source(in eclipse nav bar -> Generate Getters & Setters)
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

/*	
	void setAccno(int accno) {
		this.accno=accno; //this keyword always represents class
	}
	int getAccno() {
		return accno;
	}
*/
	
	
}
