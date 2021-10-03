package com.Arrays;
import java.util.*;

public class Sum { 
	public static void main(String [] args)
	{
		int n,i;
		Scanner us = new Scanner(System.in);
		
		System.out.println("Enter Range of Array");
		n = us.nextInt();
		 
		int [] arr = new int [n];
		System.out.println("Enter Numbers");
		
		for(i = 0; i < n; i++) 
		{
		 arr[i] = us.nextInt();	
		}
		
		 
		int sum = 0, pro = 1;
		for(int j = 0; j < arr.length; j++) {
			sum += arr[j];
			pro *= arr[j];
	}
		System.out.println("Sum of :" + sum);
		System.out.println("Product of :" + pro);
		 us.close();		
	}	
}
