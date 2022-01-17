import java.util.Scanner;

/*....Java method to count a Words in String....*/

public class Count_Words 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String Str = sc.nextLine();
		
		System.out.println("Number of Words in the String : " +CountWords(Str));	

	}
	public static int CountWords(String str)
	{
		if((str == null || str.isEmpty()))
			return 0;
		String[] words = str.split("\\s+");  //calculate all the Whitespaces in a String
		return words.length;
	}

}
