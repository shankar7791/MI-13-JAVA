import java.io.*;
public class Bitwise {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;
 
        // bitwise and
   
         System.out.println("a&b = " + (a & b));
 
        // bitwise or
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise not
        System.out.println("~a = " + ~a);
 
        // assignment
         a &= b;
        System.out.println("a = " + a);
    }
}
