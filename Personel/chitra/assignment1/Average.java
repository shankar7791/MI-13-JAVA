package com.codebind;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        
        float avg = (a+b+c+d)/4;
        
        System.out.println(avg);
	}

}
