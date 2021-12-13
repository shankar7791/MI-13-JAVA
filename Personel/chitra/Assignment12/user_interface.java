import java.util.Scanner;
import java.util.Vector;

public class user_interface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector<>();
		
		int total_name = 0;
		
		v.add("Chitra Sarode");
		v.add("Rajashri Chhatrikar");
		v.add("Swapnali Deshmukh");
		
		System.out.println("\nTotal list of name : ");
		for(String s : v)
		{
			total_name++;
			System.out.println(total_name + ". " + s);
		}
		
		while(true) {
			System.out.println("\n1. accept first name and surname \n2. display total name \n3. exit");
			System.out.println("Enter your choice ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1 : 
					System.out.println("Enter First name : ");
					String fname = sc.next();
					
					System.out.println("Enter Surname : ");
					String lname = sc.next();
					
					String full_name = fname + " " + lname;
					System.out.println("Full name is : " + full_name);
					v.add(full_name);
					break;
			    
				case 2:
					total_name = 0;
					System.out.println("\nTotal list of name : ");
					for(String s : v)
					{
						total_name++;
						System.out.println(total_name + ". " + s);
					}
					System.out.println("Total name in the list are : " + total_name);
					break;
					
				case 3:
					return;
			}
		}


	}

}
