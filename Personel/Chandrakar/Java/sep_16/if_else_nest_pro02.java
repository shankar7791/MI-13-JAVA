// nested if 
import java.util.Scanner;

class age 
 {
    public static void main(String arg[])
     {
         int input , hight;
         System.out.println("check your age your are eligible or not ");
         
         System.out.print("enter the your Age : ");
         
         Scanner ch = new Scanner(System.in);
         input = ch.nextInt();

         System.out.print("enter the your Height : ");
         hight = ch.nextInt();
        
            if(input>30) {
                if(hight > 20) {
                    System.out.println("You are eligible this post !!!");
                }
                else{
                    System.out.println("You are not eligible this post !!!");
                }
            }
            else{
                System.out.println("You are greter than 30 !!!");
            }
               
     }
 }