import java.util.*;

public class StringOp {

	public static void main(String args[]) 
	{
		int ch;
		String str,str1,str2,str3,strhold;
		//StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1.Find the Length of String\n2.Compare to String\n3.Check String is Palindrome\n");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		//System.out.println("You hav Entered "+ch);
		switch(ch)
		{
		case 1:System.out.println("Enter your String: ");
			    str=sc.next();
			   //System.out.println(str);
			   System.out.println("Length of "+str+" is " +str.length());
			   break;
		case 2:System.out.println("Enter first String?");
		        str1=sc.next();
		       System.out.println("Enter second String?");
		        str2=sc.next();
		       boolean bool=str1.equals(str2);
		       if(bool)
		    	   System.out.println(str1+" and "+str2+ "are Equal! ");
		       else
		    	   System.out.println(str1+ " and "+str2+ "are not Equal! ");
		       break;
		case 3:System.out.println("enter the string :");
			   str3=sc.next();
			   strhold=String.valueOf(str3);
			   System.out.println("str3: "+str3);
			   System.out.println("strHold: "+strhold);
			   break;
		case 4:System.out.println("Enter String ");
		       str=sc.next();
		       StringBuilder s=new StringBuilder(str);
		       System.out.println("Original string: "+str);
		       System.out.print("Reversed string:"+s.reverse() );
		       break;
		case 5:System.out.println("Enter value of first string: ");
			   str1=sc.next();
			   System.out.println("Enter value of Second string: ");
			   str2=sc.next();
               System.out.println(str1.compareTo(str2));
               break;
		case 6:	System.out.println("Enter value string: ");
		   		str1=sc.next();
		   		//
		   		System.out.println(str1.substring(8));
		   		break;
		   		
       default:System.out.println("U entered the incorrect choice!");
		}
		
		    
		
     }

	}


