package com.Arrays;
import java.util.*;
public class Evenodd 
{	
	public static void main (String args [])
	{
		int nu1,i,j;
		Scanner ts = new Scanner(System.in);
		
		System.out.println("Specifie the array range");
		nu1 = ts.nextInt();
		
		int [] a = new int[nu1];
		System.out.println("Enter data");
		
		for(i = 0; i < nu1; i++) {
			a[i] = ts.nextInt();
		}
		System.out.println("Even nos in array list ..");
		for(j = 0; j < a.length; j++ ) { 
		if(a[j] % 2 == 0)		
		{
			System.out.println(a[j]);
			
		}
		}
		
		System.out.println("odd nos in array list ..");
		for(j = 0; j < a.length; j++ ) {
		 if (a[j] % 2 != 0) {
			System.out.println(a[j]);
		}
		}
	}
}
