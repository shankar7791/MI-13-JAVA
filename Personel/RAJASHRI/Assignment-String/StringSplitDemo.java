import java.util.*;
public class StringSplitDemo {

	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur full name: ");
		str=sc.nextLine();
		int i=0;
        while(str.charAt(i)!=' ')
        {
		   System.out.print(str.charAt(i));
		  i++;
	    } 

}
}
