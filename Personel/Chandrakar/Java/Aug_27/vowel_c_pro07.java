//
import java.util.Scanner;
class vowel
 {
    public static void main(String arg[])
    {
        char ch;
        System.out.print("Enter any charecter : ");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
         {
             System.out.print("Vowel\n");

         }
        else 
         {
             System.out.print("constent\n");
         } 
    }
 }