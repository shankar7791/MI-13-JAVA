
import java.util.Scanner;

class Student
{
	int rno;
	String name;
	
	Student(int id, String info)
	{
		this.rno = id;
		this.name = info;
	}
}

public class ObjArray 
{
	

	public static void main(String[] args) 
	
	{
		Student objarr[] = new Student[5];
		int rollno;
		String sname;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Students Information");
		 
		 
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter Students of roll no.");
			rollno = sc.nextInt();
			sname = sc.nextLine();
			
			objarr[i] = new Student(rollno, sname);
			
			
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.println(objarr[i].rno +" " +objarr[i].name);
			
		}


	}

}
