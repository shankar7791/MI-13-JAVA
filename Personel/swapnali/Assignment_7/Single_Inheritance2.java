
/*......Single Inheritance Bank-Customer Information*/

class Bank 
{
	String name = "IDBI";
	String cname = "Swapnali";
	int id = 9;
}

public class Single_Inheritance2 extends Bank
{
	
	public static void main(String[] args) 
	{
		Bank obj = new Bank();

		System.out.println("Bank Name is : " + obj.name );
		System.out.println("Customer Name is : " + obj.cname );
		System.out.println("Customer Id is : " + obj.id );

	}

}
