package com.codebind;

import java.util.*;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
	        
	        Scanner sc = new Scanner(System.in);//system.in for to take input from keyboard
	        System.out.println("Enter Number:");
	        num = sc.nextInt();
	        //scan.close();
	       
	        if(num % 2 == 0)
	        {
	        	System.out.println("no is even");
	        }
	        else {
	        	System.out.println("no is odd");
	        }
	        
	}

}
