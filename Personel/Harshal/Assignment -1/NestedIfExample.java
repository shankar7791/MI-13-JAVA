import java.util.Scanner;
public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		int weight;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the age");
		age=input.nextInt();
		System.out.println("Enter the weight");
		weight=input.nextInt();
		if(age>=18)
			
		{
		
			if(weight>=50)
			{
				System.out.println("You are eligible to donate Blood");
			}
			else {
				System.out.println("You are not eligible");	
			}
		}
		
		else {
			System.out.println("Age must be greater than 18");
		}

	}

}
