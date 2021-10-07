//Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
// Now, tell user whether that number is present in array or not.
//( search element is present in the array or not)
import java.util.*;
class Arrayuser
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


          System.out.print("\nType Search Number : ");
          
          int a = obj.nextInt();

          if (true)
          {
          for(int i = 0; i<10; i++)
            {
                if (a == arr[i])
                    {
                        System.out.println("Value is persent !!");
                        break;
                    }
            }
        }
          else
          {
            System.out.println("Value is persent !!");
          
          
         







        
      }
    }
}