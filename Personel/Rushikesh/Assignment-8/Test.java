/* Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a
method with the same name 'message' that prints "This is first subclass" and "This is second
subclass" respectively. Call the methods 'message' by creating an object for each subclass.
*/

abstract class Parent
{

    void message() 
    { 

    }
  
}
  
  class Subclass1 extends Parent
  {
  
     void message() 
     {
  
        System.out.println("This is First subclass.");
  
     }
  
  }
  
  class Subclass2 extends Parent
  {
  
      void message() 
      {
  
        System.out.println("This is Second subclass.");
  
      }
  
  }
  
public class Test
{
  
     public static void main(String args[]) 
     {
  
        Subclass1 sb1 = new Subclass1();
  
        Subclass2 sb2 = new Subclass2();
  
        sb1.message();
  
        sb2.message();
  
     }
  
}