import java.util.*;
class Calculator
 {
 public static void main(String argvs[])
 {
         int ch, a, b, c;
         
        
         Scanner sc = new Scanner(System.in); // creating object of Scanner class
          
          while(true) 
         {
              System.out.println("1: Addition +");
              System.out.println("2: Subtraction -");
              System.out.println("3: Multiplication *");
              System.out.println("4: Division /");
              System.out.println("5: Exit/");
          
              System.out.print("Make your choice: ");  
              ch = sc.nextInt(); // reading user's choice
              switch (ch)
              {

                  case 1: 
                  System.out.print("Enter 1st Values : ");
                  a = sc.nextInt();

                  System.out.print("Enter 2st Values : ");
                  b = sc.nextInt();
                  c = a + b;
                  System.out.println(c);
                  
                  break;

                  case 2: 
                  System.out.print("Enter 1st Values : ");
                  a = sc.nextInt();

                  System.out.print("Enter 2st Values : ");
                  b = sc.nextInt();
                  c = a - b;
                  System.out.println(c);
                  
                  break;

                  case 3: 
                  System.out.print("Enter 1st Values : ");
                  a = sc.nextInt();

                  System.out.print("Enter 2st Values : ");
                  b = sc.nextInt();
                  c = a * b;
                  System.out.println(c);
                  
                  break;

                  case 4: 
                  System.out.print("Enter 1st Values : ");
                  a = sc.nextInt();

                  System.out.print("Enter 2st Values : ");
                  b = sc.nextInt();
                  c = a / b;
                  System.out.println(c);
                  
                  break;

                  case 5: 
                  System.exit(0);
                  
                  break;
                
                default:
                 System.out.println("Invalid choice! Please make a valid choice. \n\n");
               }
             }
 }
 } 
