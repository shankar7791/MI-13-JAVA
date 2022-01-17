//quotient and remender
import java.util.Scanner;
class remender
 {
     public static void  main(String arg[])
     {
         int a , b ;
         Scanner n = new Scanner(System.in);
         System.out.print("Enter the 1st number : ");
         a = n.nextInt();
         System.out.print("Enter the 2nd number : ");
         b = n.nextInt();
        int c = a/b ;
        int d = a%b;

         System.out.println("Quotient: " +c);
         System.out.println("remender: " +d);

         
     }
 }