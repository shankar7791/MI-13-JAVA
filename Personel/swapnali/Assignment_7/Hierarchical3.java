/*....WAP on Hierarchical Inheritance of Employee and Campany*/


class company
{
	public void company()
	{
	String name = "AmberSoft" ;
	System.out.println("Company Name = " +name);
	}
}
class employe1 extends company
{
	public void employe1()
	{
	String ename = "Swapnali";
	System.out.println("1. Employee Name = " +ename);
	}
}
class employe2 extends company
{
	public void employe2()
	{
	String empname = "Swapnil" ;
	System.out.println("2. Employee Name = " +empname);
	}
}
	
public class Hierarchical3 
{

	public static void main(String[] args) 
	{
	employe1 obj = new employe1();
	obj.company();
	obj.employe1();
		
	employe2 obj1 = new employe2();
	obj1.employe2();
	}

}

