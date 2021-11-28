//Q.Write a program to add two 2*3 matrices and print the resultannt matrix.

import java.util.Scanner;

public class MultiDiamentinalSum2 
{

	public static void main(String args[])
	{
		int arr1[][]=new int[2][3];
		int arr2[][]=new int[2][3];
		int sum[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for first array: ");
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.println("Enter the value for arr1["+i+"]["+j+"]:");
        		arr1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Enter the values for Second array: ");

        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.println("Enter the value for arr2["+i+"]["+j+"]:");
        		arr2[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Resultant Sum matrix is like:  ");
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		
        		sum[i][j]=arr1[i][j]+arr2[i][j];
        	}
        }
        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.print(sum[i][j]+"\t");
        	}
        System.out.println();
        }

	}
}