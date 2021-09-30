import java.util.*;
public class Fibonaci
{
    public static void main(String args[])
    {
        int num3;
       try
        {
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Enter number you want to print series");
          
         num3= sc.nextInt();
         
         long[] arr = new long [num3];

         arr[0]=0;
         arr[1]=1;


         //System.out.print(num1+","+num2);
        
         for(int i = 2 ; i < num3 ; i++)

         {
             arr[i] = arr[i-1] + arr[i-2];
            /*res=num1+num2;
            num1=num2;
            num2=res;

            System.out.print(","+res);*/
         }

         System.out.println("fibonacci series upto "+num3);
          
         for (int i=0; i<num3; i++)
         {
            System.out.print(arr[i]+" ");

         }
         }
        finally
        {

        }
    }
}
