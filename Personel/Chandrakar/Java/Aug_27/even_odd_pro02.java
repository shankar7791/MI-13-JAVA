// Java program to check number is even or odd

import java.util.Scanner;
class even_odd
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("check  number is  even or odd number :");
        System.out.print("enter the number : ");
        int a = obj.nextInt();
        
        if (a%2==0)
         {
            System.out.println(a + " " + " Number is Even Number");
         }
        
        else 
         {
            System.out.println(a + " " + " Number is Odd Number");
         } 
        
        
    }
}