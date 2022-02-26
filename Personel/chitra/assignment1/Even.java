package com.codebind;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,res;
        
        Scanner sc = new Scanner(System.in);//system.in for to take input from keyboard
        System.out.println("Enter Number:");
        num = sc.nextInt();
        //scan.close();
        res = num % 2;
        if( res == 0)
        {
        	System.out.println("no is even");
        }
        else {
        	System.out.println("no is odd");
        }
        
        
	}

}
