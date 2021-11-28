//Write a Java method to count all vowels in a string. 


import java.util.*;
 
class Base
{
    public void vowle(String str)
    {
        int count = 0;
        int i = 0;
        int n = str.length();

        while(i < n)
        {


            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u' )
            {
                count++;
            }
            i++;
    }
       
       System.out.println("total vowle is : " + count);

    }
}
 
class Drive extends Base
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);

        Drive obj = new Drive();
        System.out.print("Enter a word : ");
        str = sc.next();
        
        obj.vowle(str);
    }
}