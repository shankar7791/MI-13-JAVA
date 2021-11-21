/*...Write a java method to compute the future investment valuse at a given interest rate for a specified number of years*/

import java.util.Scanner;

public class Compute_Investment 
{

	public static void main(String[] args)
	{
		int i;
		int formatter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the investment Amount");
		double investment = sc.nextDouble();
		System.out.println("Input the rate of Interest");
		double rate = sc.nextDouble();
		System.out.println("Enter number of Year");
		int year = sc.nextInt();
		
		rate *= 0.01;
		System.out.println("Years   FutureValues");
		for(i = 1; i <= year; i++)
		{
		formatter = 19;
		if(i >= 10) formatter = 18;
		System.out.printf(i+ "%"+formatter+ ".2f\n", futureInvestmentValue(investment,rate/12,i));
		}
	}
	
public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int year)
{
return investmentAmount * Math.pow(1 + monthlyInterestRate,  year * 12);	

}
}
