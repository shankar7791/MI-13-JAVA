import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phone_book {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Nitin",1234567890);
		map.put("Chitra",1234567890);
		map.put("Rajashri",1234567890);

		System.out.println("Phone book entries ");
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() + ":-      " + m.getValue());
		}
		while(true)
		{
			System.out.println("\n1.Add new phone book entry\n2.Search phone number\n3.Display phone book entries\n4.Quit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter name");
				   String name = sc.next();
				   System.out.println("Enter phone no");
				   int no = sc.nextInt();
				   map.put(name, no);
				   break;
			case 2:System.out.println("Enter the contact name to search phone no");	   
				   String name1 = sc.next();
				   System.out.println(map.getOrDefault(name1, null));
				   break;
			case 3:System.out.println("Phone book entries ");
					for(Map.Entry m : map.entrySet())
					{
						System.out.println(m.getKey() + ":-      " + m.getValue());
					}
					break;
				
			case 4:return;	   
			
			
			}
		}
		
		

	}

}
