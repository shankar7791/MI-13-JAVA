/*...........Calculator Using Switch..........*/

import java.util.Scanner;

public class Calculator
{

	public static void main(String[] args) 
	{	String yn;
		do
		{
	Scanner sc = new Scanner(System.in)	;
	System.out.println("Enter first number");
	int no1 = sc.nextInt();
	System.out.println("Enter second number");
	int no2 = sc.nextInt();
	System.out.println("Select symbol +,-,*,/");
	String exp = sc.next();
	int res;
	
	
	switch(exp)
	{
		case "+" : res = no1 + no2;
					System.out.println("Addition is : " +res);
					break;
		
		case "-" : res = no1 - no2;
					System.out.println("Subtraction is : " +res);
					break;

		case "*" : res = no1 * no2;
					System.out.println("Multiplication is : " +res);
					break;
					
		case "/" : res = no1 / no2;
					System.out.println("Division is : " +res);
					break;
					
		default : System.out.println("Envalid Symbol");
		
	}
	System.out.println("Do u want to continue (Press for y for yes and n for no)");
	 yn = sc.next();
	}
		while(yn.equals("y")|| yn.equals("Y"));
		
	
	}

}
