/*Write a Java method to compute the future investment value at a given interest rate for a specified number of years. 
//Sample data (Monthly compounded) and Output:
//Input the investment amount: 1000
//Input the rate of interest: 10
Input number of years: 5

Expected Output:

Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31*/

import java.util.*;
 
class Intrest
{
    public void opration(double am,double r, int y)
    {
        double futureIvalue;
        int i = 1;

        while(i <= y)
        {
        int formatter = 19;

	    if (i >= 10)
        {
            formatter = 18;
		    System.out.printf(i + "%"+formatter+".2f\n",am*Math.pow((1+(r*0.01)/12),i*12) );
            i++;
        }
        }
    }
}
 
class Calculation extends Intrest
{
    public static void main(String[] args)
    {
        double am, r;
        int y;
        Scanner sc = new Scanner(System.in);

        Calculation obj = new Calculation();
        System.out.print("Enter Investment Amount : ");
        am = sc.nextDouble();

        System.out.print("Enter Intrest rate : ");
        r = sc.nextDouble();

        System.out.print("Enter Number of year : ");
        y = sc.nextInt();
 
        obj.opration(am, r, y);
    }
}