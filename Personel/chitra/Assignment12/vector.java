import java.util.Enumeration;
import java.util.Vector;


class Employee{
	
	int eno;
	String ename;
	String eaddr;
	
	Employee(int eno,String ename , String eaddr)
	{
		this.eno = eno;
		this.ename = ename;
		this.eaddr = eaddr;
	}
	
}

public class vector {

	public static void main(String[] args) {
		
           Employee e1 = new Employee(101,"Rajashri","Rajgurunagar");
           Employee e2 = new Employee(102,"Swapnali","Mumbai");
           Employee e3 = new Employee(103,"Chitra","Pune");
           Employee e4 = new Employee(104,"Varsha","Satara");
           Employee e5 = new Employee(105,"Nutan","Nagar");
           Employee e6 = new Employee(106,"Priya","Nashik");
           
           Vector<Employee> v = new Vector<>();
            
           v.add(e6);
           v.add(e5);
           v.add(e4);
           v.add(e3);
           v.add(e2);
           v.add(e1);
           
           Enumeration<Employee> e = v.elements();
           while(e.hasMoreElements())
           {
        	  Employee e7 = e.nextElement();
        	  System.out.println(e7.eno + " " + e7.ename + " " + e7.eaddr);
           }


           
	}

}
