import java.util.*;
public class arrayList {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		al.add("Chitra");
		al.add("Rajashri");
		al.add("Swapnali");
		al.add("Chandrakar");
		al.add("Rushikesh");
		al.add("Abhishek");
		al.add("Nitin");
		
		System.out.println("List of student names :\n ");
		for(String s : al) 
			System.out.println(s);
		
		System.out.println("\nEnter student name that you want to search in list : ");
		String name = sc.nextLine();

		int i = Collections.binarySearch(al, name);

		if(al.contains(name))
		{
			System.out.println("Student name is present in the list");
			System.out.println("Student " + name + " is present at position " + i);
		}
		else
			System.out.println("Student name is not in the list");
		
	}

}
