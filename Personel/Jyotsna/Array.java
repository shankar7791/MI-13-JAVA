package com.Arrays;
import java.util.*;

public class Array {
	
	public static void main(String [] args) {
		
		int num,i;
		Scanner is = new Scanner(System.in);
		
		System.out.println("Enter array range");
		num = is.nextInt();
		
		int arr[] = new int [num];
		System.out.println("Enter elements in array");
		
		for(i=0;i<num;i++) 
		{
		 arr[i] = is.nextInt();	
		}
		System.out.println("Display array");
		
		for(i=0;i<num;i++)
		{
			System.out.print(arr[i] + ",");
		}
		
		
	}

}
