import java.util.*;

public class StringMethods
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
  
        int n;
        String str1;

        System.out.println("Enter the String for operations");

        str1 = sc.nextLine();

        System.out.println("******** String Operations *********");

        System.out.println("Enter 1 to check Length of String");
        System.out.println("Enter 2 to check Palindrom or not");
        System.out.println("Enter 3 to check SubString of String");
        System.out.println("Enter 4 to concatnation of String");
        System.out.println("Enter 5 to check index of String");
        System.out.println("Enter 6 to check string is Equal or Not");
        System.out.println("Enter 7 to Convert String in LowerCase");
        System.out.println("Enter 8 to Convert String in UpperCase");
        System.out.println("");

        n = sc.nextInt();
        
        switch(n)
        {
         case 1:
           
                     System.out.println("Length of String is :" + str1.length());
         break;
           
         case 2:
            
                   String reverse = "";
                    int length = str1.length();   
                     for ( int i = length - 1; i >= 0; i-- )  
                    
                     reverse = reverse + str1.charAt(i);
                       
                        if (str1.equals(reverse)) 
                        { 
                            System.out.println("Entered string is a palindrome.");
                        }  
                         else  
                            System.out.println("Entered string isn't a palindrome.");   
 
         break;
           
         case 3:
                    System.out.println(str1.substring(2,4));
         break;
           
         case 4:
                    String str2;

                      System.out.println("ENter Second String");
                        
                      Scanner sc1 = new Scanner (System.in);
                         str2 = sc1.nextLine();


                    String str3 = str1.concat(str2);

                     System.out.println("After Concatnation String is:"+ str3);
                        
         
         break;
         case 5:
                System.out.println("enter the character you want to see index");

                Scanner sc2 = new Scanner (System.in);

                String ch = sc2.nextLine();

                System.out.println("index of string is :" + str1.indexOf(ch));
             
         break;

         case 6:
         String str4;

         System.out.println("Enter Second String");
           
         Scanner sc3 = new Scanner (System.in);
            str4 = sc3.nextLine();

         if (str1.equals(str4))
          {
            System.out.println("the both Strings are Same" );

          }
          else
          {
            System.out.println("String are not Same");
          }
       
         break;
         case 7:

         System.out.println("String After Conversion:"+str1.toLowerCase());

         break;

         case 8:

         System.out.println("String After Conversion:"+str1.toUpperCase());

         break;
        }
 
    }
}
