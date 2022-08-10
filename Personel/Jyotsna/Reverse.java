package com.Arrays;
import java.util.*;

public class Reverse {

	public static void main(String args[]) {
		
		int n,i,j,rev=0;
		Scanner re = new Scanner(System.in);
		
		System.out.println("Specifie range of array");
		n = re.nextInt();
		
		int [] a = new int[n];
		System.out.println("Enter the array:,");
		
		
		for(i = 0; i < n; i++) {
			a[i] = re.nextInt();
			}
		
		for (j=0;j<a.length;j++)
		{
		while(a[j] != 0) 
		{
			rev = rev * 10 + a[j] % 10;
			a[j] = a[j]/10;
		}
	System.out.println("Reverse No is:" + rev);	
	}}
}
