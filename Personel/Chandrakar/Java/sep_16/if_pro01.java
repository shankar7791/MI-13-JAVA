// if program
import java.util.Scanner;
class ifpro 
    {
        static public void main(String arg[])
         {

            int a, input;
             System.out.println("Check given Number is even or odd\n");
             System.out.print("Enter the number :");
             Scanner nam = new Scanner(System.in);
             input = nam.nextInt();

             if (input%2 == 0)
                {
                    System.out.println(input+""+" is even number");
                }
             else
                {
                    System.out.println(input+""+" is odd number");
                }




         }
    }