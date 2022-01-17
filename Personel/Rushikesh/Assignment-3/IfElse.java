import java.io.*;
import java.util.Scanner;
public class IfElse
{
   public static void main (String args[])
    {
       int num1,num2;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the First nummber");
       num1 = sc.nextInt();
       System.out.println("Enter the Second nummber");
       num2 = sc.nextInt();
       
       if (num1 > num2)
       {
        System.out.println(num1 + " is Greater than " + num2);
       
       }else
       {
        System.out.println(num1 + " is Less than " + num2);   
       }
  
    }
}
