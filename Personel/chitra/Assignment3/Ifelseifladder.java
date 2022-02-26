package com.codebind;

import java.util.Scanner;

public class Ifelseifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,c;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter three number: ");
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         
         if(a > b && a>c) {
        	 
        		 System.out.println(a+" is greater than "+b + " and " +c);
        	 
        }
         else if(b > a && b>c) {
        
        		 System.out.println(b+" is greater than "+a + " and " +c);
        	 
         }
         else if(c > a && c>b) {
        	
        		 System.out.println(c+" is greater than "+a + " and " +b);
        	 
         }
         else {
        	 System.out.println("All numbers are equal");
         }
         
	}

}
