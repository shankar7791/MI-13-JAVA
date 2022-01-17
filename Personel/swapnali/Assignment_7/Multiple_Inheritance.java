
/*......WAP on Multiple Inheritance Bank-customer Information*/

import java.util.Scanner;

class customer
	{
	String name = "Swapnali"; 
	}

class deposit extends customer
	{
	int accno = 999;
	int balance = 5000;
	}

class borrow extends deposit
{
	int loan_no = 101;
	int loan_amt = 100000;
	
	public void showdetails()
	{
		System.out.println("Customer Name:\n" +name);
		System.out.println("Enter Customer A/C Number :\n" +accno);
		System.out.println("Enter Balance :\n" +balance);
		System.out.println("Enter Loan NUmber :\n" +loan_no);
		System.out.println("Enter Loan Amount:\n" +loan_amt);
	}
}

public class Multiple_Inheritance 
{
	public static void main(String[] args) 
	{
	
		borrow b1 = new borrow();
		b1.showdetails();	
	}
}
