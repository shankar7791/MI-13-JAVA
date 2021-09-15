package com.codebind;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        x=sc.nextInt();
        System.out.println("Enter second number");
        y=sc.nextInt();
        System.out.printf("before swapping first number is : %d and second number is : %d\n",x,y);
        
        x = x + y;//x=10+12=22
        y = x - y;//y=22-12=10
        x = x - y;//x=22-10=12
        System.out.printf("after swapping first number is : %d and second number is : %d",x,y);
        
	}

}
