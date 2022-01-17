// power of number calculate
import java.util.Scanner;
class power
 {
     public static void  main(String arg[])
     {
         int a , b , c=1;
         Scanner n = new Scanner(System.in);
         System.out.print("Enter the number : ");
         a  = n.nextInt();
         System.out.print("Enter the number of power: ");
         b  = n.nextInt();
         for (int i=1 ; i<=b;i++)
         {
             c = a*c;
         }
         System.out.println("Power of : " + c);
     }
    }