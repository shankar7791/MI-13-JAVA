package com.codebind;
import java.util.Scanner;
public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two number : ");
      i = sc.nextInt();
      j = sc.nextInt();
      if(i == j) {
    	  System.out.println("Both numbers are equal");
      }
      else if(i>j) {
    	  System.out.println("first no is greater than second no."); 
      }
      else
      {
    	  System.out.println("First no. is smaller than second no.");
      }
      //
      System.out.println(5 == 3);
    	  
	}

}
