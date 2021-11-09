/*.....WAP on Single inheritance student-School Information*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Student
{
	int rollno;
	String sclname;
	String uname;

	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(in);
	void input()throws IOException
	
	{
	System.out.println("Enter Roll number");
	rollno = Integer.parseInt(br.readLine());

	System.out.println("Enter School Name");
	sclname = br.readLine();

	System.out.println("Enter University Name");
	uname = br.readLine();

	}
}

class Single_Inheritance1 extends Student
{
	void display() 
	{
		System.out.println("\nRoll number is : "+rollno);
		System.out.println("\nSchool name is : "+sclname);
		System.out.println("\nUniversity name is : "+uname);	
	}
	
	public static void main(String args [])throws IOException
	{
		Single_Inheritance1 m = new Single_Inheritance1();
		m.input();
		m.display();	
	}
}























