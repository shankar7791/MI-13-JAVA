package com.codebind;

import java.util.*;

public class String_method {

	public static void main(String[] args) {
	
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Programs on string\n ");
           for(int a = 0 ;a < 5;a++) {
        	   
           
           
           System.out.println("\n\n1.Palindrome\n2.Swap string\n3.Anagram\n4.count words from string\n5.Check two strings are equal or not");

           System.out.println("\nEnter your choice : ");
           int ch = sc.nextInt();
     
			   
           switch (ch) {
           			case 1:
           				System.out.println("Enter string");
           				String st1 = sc.next() , st2 = "";

           				 System.out.println("original string is : "+st1);
           				 
           				 for(int i = (st1.length()-1); i >= 0; i--) {
           					 st2 = st2 + st1.charAt(i);
           				 }
           				 
           				 System.out.println("Reverse string is : "+st2);
           				 
           				 if(st2.equals(st1))
           				 {
           					 System.out.println("String is Palindrome");
           				 }
           				 else
           				 {
           					 System.out.println("String is not palindrome");
           				 }
           				 break;
           			case 2:
           				 System.out.println("Enter first string : ");
           				 String FirstString = sc.next();
           				 System.out.println("Enter second string : ");
           				 String SecondString = sc.next();
           				 
           				 System.out.println("Befor swapping : ");
           				 System.out.println("first string is : " +FirstString);
           			   	 System.out.println("second string is : " +SecondString);
           			   	 
           			   	 FirstString = FirstString + SecondString;
           			   	 SecondString = FirstString.substring(0, (FirstString.length()-SecondString.length()));
           			   	 FirstString = FirstString.substring(SecondString.length());
           			   	 
           			   	 System.out.println("first string length is :"+FirstString.length());
           			   	 System.out.println("second string length is :"+SecondString.length());
           			     System.out.println("\nAfter swapping : ");
        				 System.out.println("first string is : " +FirstString);
        			   	 System.out.println("second string is : " +SecondString);
           			   	 break;
           			   	 
           			case 3 :
           				 System.out.println("Enter two string : ");
           				 String str1 = sc.next();
           				 String str2 = sc.next();
           				 
           				 char[] str1Array = str1.toLowerCase().toCharArray();
           				 char[] str2Array = str2.toLowerCase().toCharArray();
           				 
           				 Arrays.sort(str1Array);
           				 Arrays.sort(str2Array);
           				 
           				 if(Arrays.equals(str1Array, str2Array)) {
           					 System.out.println("Strings are Anagram ");
           				 }
           				 else {
           					 System.out.println("Strings are not Anagram ");
           				 }
           				
           				 break;
           				 
           			case 4:
           				 System.out.println("Enter string : ");
           				 String st = sc.next();
           				 System.out.println("String is : "+st);
           				 
           				 int wordcount = 0;
           				 int endofstring = st.length()-1;
           				 
           				 String str = st.trim();
           				 
           				 for(int i = 0; i < st.length(); i++) {
           					 
           					 if(str.charAt(i) == ' ' && str.charAt(i + 1) != ' ' ) {
           						 wordcount++;
           					 }
           					 else if(str.charAt(i) == ' ' && str.charAt(i++) == ' ' ) {
           						 i++;
           						 wordcount++;
           					 }
           					 else if (i == endofstring) {
           						 wordcount++;
           					 }
           				 }
           				 System.out.println("There are "+wordcount+" word in a string sentence");
           			     break;
           			     
           			case 5:
           				System.out.println("Enter two string : ");
           				String firstString = sc.next();
           				String secondString = sc.next();
           				
           				System.out.println("checking using equals() method : "+firstString.equals(secondString));
           				System.out.println("checking using equalsIgnoreCase() method : "+firstString.equalsIgnoreCase(secondString));
           				
           				break;
           			default :
           				System.out.println("default case");
           				   

           }
           }
	}

}
