/*........WAP to print all permutations of a given String with repetition*/

import java.util.*;
public class Permutations 
{

 public static void main(String[] args) 
 {
	 Scanner sc = new Scanner(System.in);
     
	    String s;
	    String answer="";
	     
	    System.out.print("Enter the string : ");
	    s = sc.next();
	     
	    System.out.print("\nAll possible Permutation strings are : ");
	    showPermutation(s, "");

 }

 private static void showPermutation(String str1, String NewStringToPrint) {

  if (NewStringToPrint.length() == str1.length()) 
  {
   System.out.println(NewStringToPrint);
   return;
  }
  
  for (int i = 0; i < str1.length(); i++) 
  {
   showPermutation(str1, NewStringToPrint + str1.charAt(i));
  }
 }
}
