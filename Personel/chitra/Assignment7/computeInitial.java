import java.util.Scanner;

public class computeInitial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name : ");
		String st1 = sc.nextLine();
		
		System.out.println("Your full name is : " + st1);

		String st2 = st1.trim();
		System.out.print("Initial of your name is : " + Character.toUpperCase(st2.charAt(0)));
		
		for(int i = 1; i < st2.length(); i++)
		{
			if(st2.charAt(i) == ' ' && st2.charAt(i + 1) == ' ')
			{
				i++;
				System.out.print(" " + Character.toUpperCase(st2.charAt(i + 1)));
			}
			else if(st2.charAt(i) == ' ')
			{
				System.out.print(" " + Character.toUpperCase(st2.charAt(i + 1)));
			}
		}

	}

}
