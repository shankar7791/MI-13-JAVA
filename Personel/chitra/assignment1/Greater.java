package com.codebind;

import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number:");
      num = sc.nextInt();
      if(num<10){
    	  System.out.println("number is less than 10");
      }
      else {
    	  System.out.println("number is greater than 10");
      }
	}

}
