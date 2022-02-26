abstract class Bank{
	
	abstract void getBalance();

}

class BankA extends Bank{
	
	public void getBalance()
	{
		System.out.println("$100 deposited in Bank A");
	}
}

class BankB extends Bank{
	
	public void getBalance()
	{
		System.out.println("$150 deposited in Bank B");
	}
}

class BankC extends Bank{
	
	public void getBalance()
	{
		System.out.println("$200 deposited in Bank C");
	}
}
public class abstractBankExample {

	public static void main(String[] args) {
		
		Bank B1 = new BankA();
		Bank B2 = new BankB();
		Bank B3 = new BankC();
		
		B1.getBalance();
		B2.getBalance();
		B3.getBalance();

	}

}
