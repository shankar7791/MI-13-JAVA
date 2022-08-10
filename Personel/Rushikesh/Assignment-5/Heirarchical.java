// java Program to impliment Hierarchical Inheritance using Employee example.

import java.io.IOException;
import java.util.Scanner;

class Employee
{
    int age;
    String name, address, gender;
    Scanner sc = new Scanner(System.in);
    Employee()
    {
        System.out.println("Enter Name of the Employee:");
        name = sc.nextLine();
        System.out.println("Enter Gender of the Employee:");
        gender = sc.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextInt();
    }

    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
    }
}

class FullTime extends Employee
{
    float salary;
    String des;

    FullTime()throws IOException
    {
        
        System.out.println("Enter Salary:");
        salary = sc.nextInt();
    }
    void display()
    {
		System.out.println();
        System.out.println("================================");
        System.out.println("Full Time Employee Details");
        System.out.println("================================");
        super.display();
        System.out.println("Salary: Rs."+salary);
		System.out.println();
        
    }
}

class PartTime extends Employee
{
    int workinghrs, rate;
    PartTime()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = sc.nextInt();
    }
    void calculatepay()
    {
        rate = 200 * workinghrs;
    }

    void display()
    {
		System.out.println();
        System.out.println("==============================");
        System.out.println("Part Time Employee Details");
        System.out.println("==============================");
        super.display();
        calculatepay();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: Rs."+rate);
    }
}

public class Heirarchical
{
    public static void main(String args[]) throws IOException 
    {
        System.out.println("================================");
        System.out.println("Enter Full Time Employee Details");
        System.out.println("================================");
        FullTime full = new FullTime();
        System.out.println("================================");
        System.out.println("Enter Part Time Employee Details");
        System.out.println("================================");
        PartTime part = new PartTime();
        full.display();
        part.display();
    }
}