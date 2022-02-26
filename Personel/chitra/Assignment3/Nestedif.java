package com.codebind;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,c,d=0;
		
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter three number: ");
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         
         if(a>b)
        	 
         {
        	 if(a>c)
        	 {
        		 d = a;
        	 }
        	 else
        	 {
        		 d = c;
        	 }
         }
         else if(b>c)
         {
        	d = b;
         }
        
         else
         { 
        	 d=c;
        	  
         }
         System.out.printf("largest number is :%d ",d);
	}

}
