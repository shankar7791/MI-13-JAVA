import java.util.*;
public class CountWord {

	public static void main(String[] args) {
	      
		   Scanner sc = new Scanner(System.in);
		
		   System.out.println("Enter string to count words in a string : ");
		   String str1 = sc.nextLine();
		   
		   int y = Count_Word(str1);
		   System.out.println("Number of words in a string is :" +y);
		 

	}
	public static int Count_Word(String str1) {

		int count = 0;

		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) == ' ' && str1.charAt(i + 1) != ' ') {
				count++;
			}
		}
		count = count + 1;
		return count;

	}
}
