// Java program add two binary  number. 
import java.util.Scanner;
class add_binary
    {
        public static void main(String arg[])
        {
            Scanner obj = new Scanner(System.in);
            System.out.print("enter the 1st binary number : ");
            String a = obj.next();
            System.out.print("enter the 2st binary number : ");
            String b = obj.next();

            int n1 = Integer.parseInt(a, 2);
            int n2 = Integer.parseInt(b, 2);
            int n3 = n1+n2;
            System.out.println("n1 : "+ Integer.toBinaryString(n1));
            System.out.println("n2 : "+ Integer.toBinaryString(n2));
            System.out.println("n3 = n1+n2  : "+ Integer.toBinaryString(n3));
            
             


        }

    }