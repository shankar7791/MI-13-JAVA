import java.util.*;

class Student
{
    int roll;
    String name;

    Student ( int rno ,String sname )
    {
        this.roll=rno;
        this.name=sname;
    }
}
 public class ArrayObj
{   
    public static void main (String[] args)
    { 
        
      Scanner sc = new Scanner(System.in);
      int n,rollno;
      String name;
    
      
      System.out.println("Enter how many records you want to insert");
      
      n = sc.nextInt();
      Student arr[] = new Student[n];
      
      System.out.println("Enter Student Roll Number And Name.");
      for (int i=0; i < n; i++ )
      
      {
           
           rollno = sc.nextInt();
           name = sc.nextLine();

           arr[i] = new Student(rollno , name);

      }
      System.out.println();
      System.out.println("Student Details Are:");
      for (int i = 0; i < n; i++)
      {
          
          System.out.println( arr[i].roll +"  "+ arr[i].name);
      }
    }


}

