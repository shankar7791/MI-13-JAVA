import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class hash_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 Hashtable<String,String> ht = new Hashtable<String,String>();
		 
		 System.out.println("Information of products : ");
		 ht.put("P001", "Maruti800");
		 ht.put("P002", "MarutiZen");
		 ht.put("P003", "MarutiEsteem");
		 
		 System.out.println("List of Products"); 
		 System.out.println("Product Id  " + "     Product Name"); 
		 for(Map.Entry m : ht.entrySet())
		 { 
			 System.out.println(m.getKey() + "               " + m.getValue());
		 }
		 
		 System.out.println("Enter the no of products that u want to enter");
		 int noOfProduct = sc.nextInt();
		 
		 for(int i = 0; i < noOfProduct ; i++) 
		 { 
			 System.out.println("Enter product id : ");
		     String pid = sc.next();
		 
		     System.out.println("Enter product name : "); 
		     String pname = sc.next();
		  
		     ht.put(pid, pname);
		  
		  }
		 
		 System.out.println("List of Products"); 
		 System.out.println("Product Id  " + "     Product Name"); 
		 for(Map.Entry m : ht.entrySet())
		 { 
			 System.out.println(m.getKey() + "               " + m.getValue());
		 }
		 System.out.println("Enter product id that you want to search ");
	   
		 String id = sc.next();
	   
	     System.out.println(ht.getOrDefault(id, "not found"));
	     
	     System.out.println("Enter the product id that you want to remove from list");
	     String id1 = sc.next();
	     
	     ht.remove(id1);
	     System.out.println("Product has been removed successfully from list. ");
	     
	     System.out.println("List after removing product\n");
	     
	     System.out.println("Product Id  " + "     Product Name"); 
		 for(Map.Entry m : ht.entrySet())
		 { 
			 System.out.println(m.getKey() + "               " + m.getValue());
		 }
		 

	}

}
