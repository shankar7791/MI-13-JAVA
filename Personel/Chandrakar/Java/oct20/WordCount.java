//Write a Java method to count all words in a string.

import java.util.Scanner;

class CountWord {

    public void opration(String str)
    {
        int count = 1;
        int i = 0;
        int n = str.length();
        
        while(i < n)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
            i++;
        }
        System.out.println("Number of words in a string : " + count);
    }
 
    public static void main(String[] args) {
        String str ;

        System.out.print("Enter the sentences : ");
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        CountWord obj = new CountWord();
        obj.opration(str);
 
        
    }
}