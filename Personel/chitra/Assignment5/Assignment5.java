package com.codebind;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		System.out.println("\n***************Array programs******************");
		
		Scanner sc = new Scanner(System.in);
		
		for(int m = 1; m < 7; m++) {

		System.out.println("\n\n1.Print Array\n2.Search element is present or not\n3.Count even and odd numbers\n4.Print reverse array\n5.Sum and product of an array\n6.Largest and smallest element of array\n7.Ascending and descending array");
		
		System.out.println("\nEnter your choice : ");
		int ch = sc.nextInt();
		
		switch (ch) {
		      case 1:int arr[] = new int[10];
		      
		             System.out.println("Enter array integer values : ");
		             
		             for(int i = 0; i < arr.length; i++)
		             {
		            	 arr[i] = sc.nextInt();
		             }
		             
		             System.out.println("\nPrinting array: ");
		             
		             for(int i = 0; i < arr.length; i++)
		             {
		            	 System.out.printf("\narr[%d] = ",i );
		            	 System.out.print(arr[i]);
		             }
		             break;
		             
		      case 2:int arr1[] = new int[10];
		      
	                 System.out.println("Enter array integer values : ");
	                 
	                 for(int i = 0; i < arr1.length; i++)
	                 {
	                	 arr1[i] = sc.nextInt();
	                 } 
	                 
	                 System.out.println("Enter any number to check whether number is present in array or not :");
	                 int n = sc.nextInt();
	                 
	                 boolean IsPresent = false;
	                 
	                 for(int i = 0; i < arr1.length; i++)
	                 {
	                	 if (n == arr1[i])
	                	 {
	                		 IsPresent = true;
	                		 break;
	                	 }
	                	 
	                 }
	                 
	                 if(IsPresent) {
	                	 System.out.println("number is present");
	                 }
	                 
	                 else {
	                	 System.out.println("number is not present");
	                 }
	                 break;
	                 
		      case 3: int arr2[] = new int[20];
		              int even_count = 0;
		              int odd_count = 0;
		      
		      		 System.out.println("Enter array integer values : ");
              
		      		 for(int i = 0; i < arr2.length; i++)
		      		 {
		      			 arr2[i] = sc.nextInt();
		      		 }  
		      		 
		      		System.out.println("\nPrinting array: ");
		      		 
		      		 for(int i = 0; i < arr2.length; i++)
		             {
		            	 System.out.print(arr2[i]+" ");
		             }
		      		 
		      		for(int i = 0; i < arr2.length; i++)
		      		 {
		      			 if(arr2[i]%2 == 0) {
		      				 
		      				 even_count++;
		      				 
		      			 }
		      			 else {
		      				odd_count++;
		      			 }
		      		 }  
		      		 
		      		System.out.println("\nTotal even numbers are : "+even_count);
		      		System.out.println("Total odd numbers are : "+odd_count);
		      		
		      		 break;
		      case 4:int arr3[] = new int[10];
		             int arr4[] = new int[10];
		    
		      		System.out.println("Enter array integer values : ");
              
		      		for(int i = 0; i < arr3.length; i++)
		      		{
		      			arr3[i] = sc.nextInt();
		      		} 
		      		
		      		System.out.println("Original array is :");
		      		for(int i = 0; i < arr3.length; i++)
		      		{
		      			System.out.print(arr3[i] + " ");
		      		} 
		      		System.out.println("\nReversed array is : ");
		      		for(int i = arr3.length-1; i >=0 ; i--)
		      		{
		      			for(int j = 0; j < arr4.length;j++)
		      			{
		      				arr4[j] = arr3[i];
		      				System.out.print(arr4[j] + " ");
		      				break;
		      			}
		      		}
		      		
		      		break;
		     case 5:int arr5[] = new int[10];
		     		int sum = 0;
		     		int product = 1;
		      
		     		System.out.println("Enter array integer values : ");
             
		     		for(int i = 0; i < arr5.length; i++)
		     		{
		     			arr5[i] = sc.nextInt();
		     			sum += arr5[i];
		     			product *= arr5[i];
		     			
		     		} 	
		     		System.out.println("Sum of all elements of an array is : "+sum);
		     		System.out.println("Product of all elements of an array is : "+product);
		     		break;
		     case 6: int arr6[] = new int[5];
		             
		     		System.out.println("Enter array integer values : ");
             
		     		for(int i = 0; i < arr6.length; i++)
		     		{
		     			arr6[i] = sc.nextInt();
		     			
		     		}
		     		
		     		int a = arr6[0];
		     		int b = arr6[0];
		     		
		     		for(int i = 0; i < arr6.length; i++)
		     		{
		     			if(a > arr6[i]) {
		     				a = arr6[i];
		     			}
		     			if(b < arr6[i]) {
		     				b = arr6[i];
		     			}
		     			
		     		}
		     		System.out.println("Smallest element of an array is : "+a);
		     		System.out.println("largest element of an array is : "+b);
		     		break;
		     		
		     case 7:int arr7[] = new int[10];
             
     				System.out.println("Enter array integer values : ");
     
     				for(int i = 0; i < arr7.length; i++)
     				{
     					arr7[i] = sc.nextInt();
     			
     				} 	
     				
     				Arrays.sort(arr7);
     				
     				System.out.println("Ascending order of array is : ");
     				for(int i = 0; i < arr7.length; i++)
     				{
     					System.out.print(arr7[i] + " ");
     			
     				} 
     				
     				System.out.println("\nDescending order of array is : ");
     				for(int i = arr7.length-1; i >= 0; i--)
     				{
     					System.out.print(arr7[i] + " ");
     			
     				}
     				break;
     				
         default :	System.out.println("Enter correct choice ");	
                    break;
     				
		}
		}
		
	}

}
