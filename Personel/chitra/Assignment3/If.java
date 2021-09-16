package com.codebind;

import java.util.*;

public class If {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		x = sc.nextInt();
		System.out.println("Age is"+x);
		if(x > 18) {
			System.out.println("Age is greater than 18.");
	    }
	}

}
