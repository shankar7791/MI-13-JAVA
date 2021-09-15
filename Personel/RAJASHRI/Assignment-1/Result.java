import java.util.*;
public class Result {

	public static void main(String[] args)
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks :");
		marks=sc.nextInt();
		if(marks>80)
		{
			System.out.println("Distinction!!");
			
		}
		else if(marks>70 && marks<80)
		{
			System.out.println("First Class!!");	
		}
		else if(marks>55 && marks<70)
		{
			System.out.println("second class!!");
		
		}
		else if(marks<40 && marks>55)
		{
		System.out.println("Third class!!");
		}
		else
		{
			System.out.println("Fail!!");
		
		}
	}
	

	}


