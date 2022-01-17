/*.....WAP on Hierarchical inheritance student-School Information*/

class Student3
{
	public void Student3()
	{
	String name = "swapnali" ;
	System.out.println("Student Name = " +name);
	}
}

class SchoolStudent3 extends Student3
{
	public void SchoolStudent3()
	{
	String classname = "BE";
	System.out.println("Student class Name = " +classname);
	}
}

class BEStudent3 extends Student3
{
	public void BEStudent3()
	{
	String semister = "4th Semister" ;
	System.out.println("Student semester Name = " +semister);
	}
}
	
public class Hierarchical_Inheritance1 {

	public static void main(String[] args) 
	{
		SchoolStudent3 obj = new SchoolStudent3();
		obj.Student3();
		obj.SchoolStudent3();
		
		BEStudent3 obj1 = new BEStudent3();
		obj1.Student3();
		obj1.BEStudent3();
	}
}
