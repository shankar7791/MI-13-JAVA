import java.io.*;
import java.util.*;

public class IfElseLadder 
{  
   public static void main(String[] args) 
   {  
     int n;  
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter Your Age ");
       n= sc.nextInt();
      
      if(n < 10)
      {  
        System.out.println("You are a Child");  
      }  
        else if(n>=10 && n<18)
        {  
           System.out.println("You are a Teenager");   
        }  
       else if(n>=18 && n<30)
       {  
        System.out.println("You are a Young Man");  
       }  
       else if(n>=30 && n<55)
       {  
        System.out.println("You are Middle Age ");  
       }  
       
       else{  
        System.out.println("You are Olde Man!!");  
    }  
  }  
}  
