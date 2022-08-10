
import java.util.Scanner;
import java.util.Scanner.*;

class EvanOdd {
 public static void main(String args[])
 {
	 int i;
	 System.out.println("enter the number");
	 Scanner sc=new Scanner(System.in);
	 i=sc.nextInt();
	 if (i % 2 == 0)
		 System.out.println(" the number is Even");
	 else
		 System.out.println("the number is Odd");
 }
}
