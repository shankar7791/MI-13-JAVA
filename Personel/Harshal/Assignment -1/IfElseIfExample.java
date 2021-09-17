import java.util.Scanner;
public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		System.out.println("Enter marks");
		Scanner input=new Scanner(System.in);
		marks=input.nextInt();
		if(marks<35)
		{
			System.out.println("Fail");
		}
		else if(marks>=50&&marks<=60)
		{
			System.out.println("D grade");
		}
		else if(marks>=61&&marks<=70)
		{
			System.out.println("C grade");
		}
		else if(marks>=71&&marks<80)
		{
			System.out.println("B grade");
		}
		else if(marks>=81&&marks<=90)
		{
			System.out.println("A grade");
		}
		else if(marks>=91&&marks<=100)
		{
			System.out.println("A+ grade");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
