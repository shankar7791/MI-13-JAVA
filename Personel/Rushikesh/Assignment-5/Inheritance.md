Questions:

1. Consider the following two classes:
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
b. Which method hides a method in the superclass?
c. What do the other methods do?


2. Consider the Card, Deck, and DisplayDeck classes you wrote in Questions and Exercises:
Classes. What Object methods should each of these classes override?

Exercises:

1. Write the implementations for the methods that you answered in question 2.
Answer -> Answer is in Card2.java Program.


Answers :

Q1 Answer-
          a : methodTwo.
     
          b : methodFour.
          
          c : They cause compile-time errors.
          
Q2 Answer-
             Card and Deck should override equals, hashCode, and toString.
	   
          


