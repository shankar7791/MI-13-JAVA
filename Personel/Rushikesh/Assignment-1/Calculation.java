
import java.io.*;
import java.util.*;

class Calculation {
public static void main(String args[])
{
	int num1,num2,add,sub,mult,opt;
	float div;
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter first number");
	num1=sc.nextInt();
	
	System.out.println("Enter Second number");
	
	num2=sc.nextInt();
	while (true)
	{
	System.out.println("For Addition Enter 1");
	System.out.println("For Substraction Enter 2");
	System.out.println("For multiplication Enter 3");
	System.out.println("For Dividation Enter 4");
	System.out.println("For Exit Enter 5");
	
	opt=sc.nextInt();
	switch(opt)
{
	case 1:
		add=num1+num2;
		System.out.println("Addition of two number is:" + add);
       break;
       
	case 2:
		sub=num1-num2;
		System.out.println("Substraction of two number is:" + sub);
       break;
       
	case 3:
		mult=num1*num2;
		System.out.println("Multiplication of two number is:" + mult);
       break;
       
	case 4:
		div=num1/num2;
		System.out.println("division of two number is:" + div);
       break;
	case 5:
		System.exit(0);
      
       
	}
	}
}

}
