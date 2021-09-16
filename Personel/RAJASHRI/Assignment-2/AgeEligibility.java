import java.util.*;
public class AgeEligibility {

	public static void main(String[] args)
	{
		//Turnary operator use
		int age;
		System.out.println("Enter Ur age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		String str=(age>=18)?"you can Vote!" : "You can not vote!!";
		System.out.println(str);
	}

}
