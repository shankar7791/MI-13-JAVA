// java program simpale intrest

import java.util.Scanner;
class simpale
 {
     public static void  main(String arg[])
     {
         double a ,p,r, t,si;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the principle amount: ");
         p = sc.nextDouble();
         System.out.print("Enter rate  intrest : ");
         r = sc.nextDouble();
         System.out.print("Enter time   : ");
         t = sc.nextDouble();
         a = (p*r*t)/100;
         System.out.println("Simple : " +a);
     }
    }