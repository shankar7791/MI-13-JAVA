package com.Arrays;

import java.util.*;

public class Searchelement {
	
	public static void main(String [] args) {
		
		int num,i,search,flag=0;
		Scanner is = new Scanner(System.in);
		
		System.out.println("Enter array range");
		num = is.nextInt();
		
		int arr[] = new int [num];
		System.out.println("Enter elements in array");
		
		for(i=0;i<num;i++) 
		{
		 arr[i] = is.nextInt();	
		}
		System.out.println("Enter the search number");

		search = is.nextInt();
		
		for(i=0;i<num;i++)
		{
		
		if (arr[i] == search) 
		{
			System.out.println("The element is present in arraylist");
			break;
		}
		}
		
		if (flag == 0)
		{
		System.out.println("The element is not present in this arraylist");	
		}
}
}