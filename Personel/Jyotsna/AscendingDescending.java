package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingDescending {
public static void main(String args[]) {
	
	 int no,i;
	 Scanner op = new Scanner(System.in);
	 
	 System.out.println("Set up the size of array");
	 no = op.nextInt();

	 //Ascending
	 int ay [] = new int[no];
	 System.out.println("Enter first in array");
	 	  for(i = 0; i < no; i++) {
		 ay[i] = op.nextInt();
	 } 
	 System.out.println("Array list:" + Arrays.toString(ay));

	 int t = ay.length;
	 
	 for(int j = 0;j < t-1; j++)   //Number of pass
	 {
		 for(int k = 0; k < t-1;k++)   //Iteration in each pass
			 {
			   if (ay[k] > ay[k + 1]) 
			   {
				   int tp = ay[k];
				   ay[k] = ay[k + 1];
				   ay[k + 1] = tp;
			   }
			   }
	 }
		 System.out.println("Array in Ascending Order: " +Arrays.toString(ay));	 

		 
// Descending
		 
		 int ty [] = new int[no];
		 System.out.println("Enter second array");
		 for(i = 0; i < no; i++) {
			 ty[i] = op.nextInt();
		 }
		 System.out.println("Array list:" + Arrays.toString(ty));		
		int t1 = ty.length; 
		 for(int j = 0;j < t1-1; j++)   //Number of pass
		 {
			 for(int k = 0; k < t1-1;k++)   //Iteration in each pass
				 {
				   if (ty[k] < ty[k + 1]) 
				   {
					   int tp1 = ty[k];
					   ty[k] = ty[k + 1];
					   ty[k + 1] = tp1;
				   }
				 }
		 }
	       System.out.println("Array in Descending Order: " +Arrays.toString(ay));
	       op.close();
}
}
