
// coumpound intrast 
import java.util.Scanner;
class compound
 {
     public static void  main(String arg[])
     {
         double a ,p,r, t, ci,t1=1;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the principle amount: ");
         p = sc.nextDouble();
         System.out.print("Enter rate  intrest : ");
         r = sc.nextDouble();
         System.out.print("Enter time   : ");
         t = sc.nextDouble();
         r = (1 + r/100);

         for(int i=0; i<t; i++)
            t1=t1*r;
         a = p*t1;
         System.out.println("Amount : "+a);
         ci = a-p;
         System.out.println("compount intrest : "+ci);
         

     }
 }