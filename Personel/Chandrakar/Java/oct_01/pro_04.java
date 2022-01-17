//Take 10 integer inputs from user and store them in an array. 
//Now, copy all the elements in an another array but in reverse order.
import java.util.*;
class Arrayrever
{
    public static void main(String[] args)
      {
          int arr[] = new int[10];
          int arr02[] = new int[10];

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


          int i = 9;
          for(int k = 0; k < 10; k++)
            {
                arr02[k] = arr[i];
                System.out.print(" |" + arr02[k]);
                i--;
            } 

          System.out.print(" |\n");


             
      
    }
}