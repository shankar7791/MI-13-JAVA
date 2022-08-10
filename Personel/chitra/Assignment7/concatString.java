
public class concatString {

	public static void main(String[] args) {
		
		String st1 = "\"Hi,";
		String st2 = "mom.\"";
		
		System.out.println("first string is : " + st1);
		System.out.println("second string is : " + st2);
		
		System.out.println("\nfirst way of concatenate of two string by + operator : "+ st1+st2);
		System.out.println("second way of concatenate of two string by concat method : " + st1.concat(st2));
	}

}
