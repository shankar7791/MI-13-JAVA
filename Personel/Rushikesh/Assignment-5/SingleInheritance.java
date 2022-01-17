// java Program to impliment Single Inheritance using Student example.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student 
{

    int roll;
    String cname;
    String uname;

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);

    void input() throws IOException 
    {
        System.out.print("Enter Roll Number:");
        roll = Integer.parseInt(br.readLine());

        System.out.print("Enter Scool Name:");
        cname = br.readLine();

        System.out.print("Enter University Name:");
        uname = br.readLine();
    }
}

class SingleInheritance extends Student 
{

    void display() 
    {
        System.out.print("\nRoll Number is :" + roll);
        System.out.print("\nScool Name is :" + cname);
        System.out.print("\nUniversity Name is :" + uname);
    }

    public static void main(String args[]) throws IOException 
    {
        SingleInheritance c = new SingleInheritance();
        c.input();
        c.display();
    }
}
