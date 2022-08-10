import java.util.*;
class Temp
{
	int getCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		
		return count;
	}
	
}
public class VovelsCount 
{
	public static void main(String[] args) 
	{
		String str;
		int c=0;
		Scanner sc=new  Scanner(System.in);
		Temp t=new Temp();
		System.out.println("Enter your string:");
		str=sc.next();
		c=t.getCount(str);
		if(c==0)
		{
			System.out.println("no vovles found in ur String");
			
		}
		else
		{
			System.out.println(c+" vovels are present in "+str);
		}
	}

}
