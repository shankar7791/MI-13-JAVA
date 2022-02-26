//Questions and exercises:Inheritance

//Questions
//1. Consider the following two classes:

 public class ClassA 
 {
  public void methodOne(int i) 
  {
  }
  public void methodTwo(int i) 
  {
  }
  public static void methodThree(int i) 
  {
  }
  public static void methodFour(int i) 
  {
  }
 }
 
  public class ClassB extends ClassA
  {
   public static void methodOne(int i) 
   {
   } 
   public void methodTwo(int i) 
   {
   }
   public void methodThree(int i) 
   {
   }
   public static void methodFour(int i) 
  {
  }
}

a. Which method overrides a method in the superclass?
Ans:methodTwo

b. Which method hides a method in the superclass?
Ans:methodFour

c.what do the other methods do?
Ans:compile time error

c. What do the other methods do?
Ans:Compile time error
