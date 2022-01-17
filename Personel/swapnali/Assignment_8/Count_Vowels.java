/*...Write a JAVA method to count all vowels in string*/

import java.util.Scanner;

public class Count_Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String Str = sc.nextLine();
		
		System.out.println("Number of vowels in the String : " +vowels(Str));	
	}
	public static int vowels(String str)
	{
		int count = 0;
		for(int i = 0; i<str.length(); i++ )
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 			str.charAt(i)=='o' || str.charAt(i)=='u' )
			{
			count++;
			}	
		}
		return count;
	}
}
