import java.io.*;
import java.util.*;
 public class NastedIfElse
{      
    public static void main(String[] args) 
    {      
      int n,m;  
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Your Age ");
       n= sc.nextInt();  
       
       System.out.println("Enter Your Weight ");
       m= sc.nextInt();  
   
       if(n>=18)
       {      
         if(m>50)
         {    
            System.out.println("You are eligible to donate blood");    
         }
          else
          {  
            System.out.println("You are not eligible to donate blood");    
          }  
        } 
        else
        {  
          System.out.println("Age must be greater than 18");  
        }      
      } 
 }  
