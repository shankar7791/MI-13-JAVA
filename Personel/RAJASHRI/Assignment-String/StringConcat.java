import java.lang.String;
public class StringConcat {

	public static void main(String[] args) 
	{
		String str1="Hi,";
		String str2="Mom";
    
		String str3=str1+str2;
		
		System.out.println(str3);
		
		System.out.println(str1.concat(str2));

	}

}
