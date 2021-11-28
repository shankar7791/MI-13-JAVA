//Take 10 integer inputs from user and store them in an array and print them
//on screen
import java.util.*;
class Array
{
    public static void main(String[] args)
      {
          int arr[] = new int[10];

          Scanner obj = new Scanner(System.in);
          System.out.print("Enter your values : ");
          for(int i = 0; i < 10; i++)
            {
                arr[i] = obj.nextInt();
            } 

          for(int j = 0; j < 10; j++)
            {
               int n = arr[j];
               System.out.print(" |"+n );

            }
            System.out.println(" |");


        
      }
}