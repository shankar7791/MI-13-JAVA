import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String st1 = sc.nextLine();
		
		System.out.println("Enter second string : ");
		String st2 = sc.nextLine();
		
		System.out.println("\nfirst string is : " + st1);
		System.out.println("second string is : " + st2);
		
		char[] arr1 = st1.toLowerCase().toCharArray();
		char[] arr2 = st2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("\nStrings are Anagram");
		}
		else
		{
			System.out.println("\nStrings are not Anagram");
		}

	}

}
