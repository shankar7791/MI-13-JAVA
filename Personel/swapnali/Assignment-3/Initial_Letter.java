import java.util.Scanner;

public class Initial_Letter 
{

	public static void main(String[] args) 
	{
		String str , str1 = " ";
		int i , n = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		str = sc.nextLine();
		
		str1 = str1 + str.charAt(0);
		
		for(i=0 ; i< str.length() ; i++)
			
		{
		char c = str.charAt(i);
		if(c == ' ')
			
		{
			n = n+1;
			
			if(n == 1)
			str1 = str1+ "." +(str.charAt(i+1));
			
			if(n==2)
			str1 = str1+ "." +(str.charAt(i+1));	
		}
		}
		
		System.out.println(str1);
		
		
		
	}

}
