/*.....WAP on Multilevel inheritance student-School Information*/

class Student1
	{
	String name = "swapnali" ;
	}
class SchoolStudent extends Student1
	{
	String classname = "BE";	
	}
class BEStudent extends SchoolStudent
{
	String semister = "4th Semister" ;

	public void showDetails()
	{
	System.out.println("Student Name = " +name);
	System.out.println("Student class Name = " +classname);
	System.out.println("Student semester Name = " +semister);
	}
}
public class Multiple_Inheritance1 
{

	public static void main(String[] args)
	{
		BEStudent obj = new BEStudent();
		obj.showDetails();
	}

}
