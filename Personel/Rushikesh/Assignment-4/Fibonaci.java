import java.util.*;
public class Fibonaci
{
    public static void main(String args[])
    {  
        int num3;
       
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Enter number you want to print series");
          
         num3= sc.nextInt();
         
         long[] arr = new long [num3];

         arr[0]=0;
         arr[1]=1;

         for(int i = 2 ; i < num3 ; i++)

         {
             arr[i] = arr[i-1] + arr[i-2];
           
         }

         System.out.println("fibonacci series upto "+num3);
          
         for (int i=0; i<num3; i++)
         {
            System.out.print(arr[i]+" ");

         }
        
    }
}
