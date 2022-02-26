import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input string to count vowels in a string : ");
		String str = sc.next();
		 
		 int x = Count_Vowel(str); System.out.println("Total vowel in string is :" +x);
		
	}

	public static int Count_Vowel(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
}
