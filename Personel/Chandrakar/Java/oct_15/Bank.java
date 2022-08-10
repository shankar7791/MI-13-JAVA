class BankAccount {
	int amount = 1000;
}

class Customer extends BankAccount{
	String Bname = "HDFC Bank" ;
	
}

public class Bank extends Customer {
	String Address = "Bhilai";

	public static void main(String[] args) {
		
		Bank obj = new Bank();
	
		System.out.println("Customer Amount is : " + obj.amount);
		System.out.println("Customer Bank name  is : " + obj.Bname);
		System.out.println("Customer Address is : " + obj.Address);
		
		
	}

}
