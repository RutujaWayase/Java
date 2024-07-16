package oopsPolymorphismEncapsulation;

public class AccountMain {
	
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setAccno(101);
		//acc.getAccno()
		System.out.println(acc.getAccno());
		
		acc.setAmount(56000);
		acc.setName("john");
		
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		
		
		
	}

}
