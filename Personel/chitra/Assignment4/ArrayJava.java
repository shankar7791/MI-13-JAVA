package com.codebind;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Programs on Arrays ");
		System.out.println("\n1.Average of an aarray\n2.Smallest no in array\n3.HCF of array\n4.sum of two arrays\n5.Merge two arrays");
	    
		System.out.println("\nEnter your choice : ");
	    int ch = sc.nextInt();
	    
		switch (ch) {
				
		case 1:
			double arr[], sum = 0.0 , avg = 0.0;
			System.out.println("Enter size of array  : ");
			int size = sc.nextInt();
			
			arr = new double[size];
			
			System.out.println("Enter array elements : ");
			for(int i =0 ; i<arr.length; i++)
			{
				arr[i] = sc.nextDouble();
				sum += arr[i];
			}
			avg = sum/arr.length;
			System.out.println("Average : "+avg);
			break;
			
		case 2:
			System.out.println("Enter size of array: ");
			int length = sc.nextInt();
			
			int[] numbers = new int[length];
			
			System.out.println("Enter array elements : ");
			for(int i =0 ; i<numbers.length; i++)
			{
				numbers[i] = sc.nextInt();
			}
			
			int min = 0;
			min = numbers[0];
			
			for(int i = 1; i < numbers.length; i++)
			{
				if(min > numbers[i])
				{
					min = numbers[i];
				}
			}
			
			System.out.println("Smallest number is : "+min);
			break;
		case 3:
			System.out.println("Enter size of array: ");
			int no = sc.nextInt();
			
			int[] num = new int[no];
			
			System.out.println("Enter array elements : ");
			for(int i =0 ; i<num.length; i++)
			{
				num[i] = sc.nextInt();
			}
			
			int result = num[0];
			
			for(int i = 1; i < no; i++)
			{
				while(result != num[i])
				{
					if (result > num[i])
					{
						result = result - num[i];
					}
					else
					{
						num[i] = num[i] - result;
					}
				}
			}
			System.out.println("HCF of array is : "+result);
			break;
		
		case 4:	
			System.out.println("Enter size of first array : ");
			int firstArray = sc.nextInt();
			
			System.out.println("Enter size of second array : ");
			int secondarray = sc.nextInt();
			
			if(firstArray != secondarray ) {
				System.out.println("Both array must have same size ");
				return;
			}
			
			int arr1[] =new int [firstArray];
			int arr2[] =new int [firstArray];
			int arr3[] =new int [firstArray];
			
			System.out.println("Enter first array elements : ");
			for(int i =0 ; i<arr1.length; i++)
			{
				arr1[i] = sc.nextInt();
			}

			System.out.println("Enter second array elements : ");
			for(int i =0 ; i<arr2.length; i++)
			{
				arr2[i] = sc.nextInt();
			}
			

			System.out.println("Addition of two array elements : ");
			for(int i =0 ; i<arr3.length; i++)
			{
				arr3[i] = arr1[i] + arr2[i];
			}
			System.out.println(Arrays.toString(arr3));
			break;
			
		case 5:	
			System.out.println("Enter size of first array : ");
			int src1 = sc.nextInt();
			
			System.out.println("Enter size of second array : ");
			int src2 = sc.nextInt();
			
			int array1[] =new int [src1];
			int array2[] =new int [src2];
			
			int array3[] =new int [array1.length + array2.length];
			
			System.out.println("Enter first array elements : ");
			for(int i =0 ; i<array1.length; i++)
			{
				array1[i] = sc.nextInt();
			}
			
			System.out.println("Enter second array elements : ");
			for(int i =0 ; i<array2.length; i++)
			{
				array2[i] = sc.nextInt();
			}
			
			for(int i = 0;i < array1.length; i++)
			{
				array3[i] = array1[i];
			}
			
			for(int i = 0, j = array1.length;j <( array1.length + array2.length); j++, i++)
			{
				array3[j] = array2[i];
			}
			
			System.out.println("Array1 = "+Arrays.toString(array1));
			System.out.println("Array2 = "+Arrays.toString(array2));
			System.out.println("Merged Array = "+Arrays.toString(array3));
			
			break;
			
		default : System.out.println("default case");	
			
		}
		

	}

}
