import java.util.*;
class Words
{
	public int countw(String str)
	{  
		int count=1;
	
		for (int i = 0; i < str.length()-1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
            {
                count++;
            }
        }
		return count;
	}
	
	
	
}
public class CountWords
{

	public static void main(String[] args)
	{
		String str;
		int c;
		Scanner sc=new  Scanner(System.in);
		Words obj=new Words();
		System.out.println("Enter your string:");
		str=sc.nextLine();
		c=obj.countw(str);
		System.out.println("u r string contains "+c+" words");
	}

}
