//Take 20 integer inputs from user and print the following:
//(Print  numbers and count of even and odd numbers)

import java.util.*;
class Arrayeven
{
    public static void main(String[] args)
      {
          int arr[] = new int[20];

          Scanner obj = new Scanner(System.in);
          System.out.print("Enter your values : ");
          for(int i = 0; i < 20; i++)
            {
                arr[i] = obj.nextInt();
            } 

          System.out.print("\n"); 

          for(int j = 0; j < 20; j++)
            {
               int n = arr[j];
               System.out.print(" |"+n );

            }
            System.out.println(" |\n");
            
          
          System.out.print("Even Number is : ");
          for(int i = 0; i<20; i++)
            {
                if (arr[i]%2 == 0)
                    {
                        System.out.print(" " + arr[i] );  
                    }

            } 

          System.out.print("\n"); 
          System.out.print("\nodd number is : ");  
          for(int i = 0; i<20; i++)
            {
                if (arr[i]%2 != 0)
                    {
                        System.out.print(" " + arr[i] );  
                    }

            }      

          System.out.print("\n");    
      
    }
}