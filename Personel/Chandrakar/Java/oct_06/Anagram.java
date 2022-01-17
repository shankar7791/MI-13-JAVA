import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "avaj";

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.print("Strings is Anagram\n");
		} else {
			System.out.print("Strings is not Anagram\n");
		}

	}

}
