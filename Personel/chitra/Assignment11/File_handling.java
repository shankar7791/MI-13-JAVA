import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class File_handling {

	public static void main(String[] args) {
		
		System.out.println("******File Handling********");
		

		
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n1.Create new file\n2.Write data into file\n3.Read data from file \n4.Delete file\n5.Search file\n6.Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			
			     case 1:try{
			    	 	System.out.println("Create employee file to keep record of employee");
			    	 	String fname = br.readLine();
			    	        File f0 = new File(fname);
			    	        
			    	        if(f0.createNewFile()) {
			    	    	   
			    	    	   System.out.println("File is created : " + f0.getName());
			    	        } 
			    	        else {
			    	    	   System.out.println(f0.getName() + " file already exist.");
			    	        }
			    	 
			     		  }
			           	  catch(Exception e) {
			           		  System.out.println(e); 
			           	   }
			     			break;
			     case 2:
			            try {
				    	    File f0 = new File("employee.txt");
			            	    FileOutputStream fout = new FileOutputStream(f0,true);
			            	    PrintStream pout = new PrintStream(fout);

				    	    System.out.println("Enter Employee data into File");   
				            System.out.println("Enter Employee Id");
				            String id = br.readLine();
				            byte[] id1 = id.getBytes();
				            
				            System.out.println("Enter Employee name");
				            String name = br.readLine(); 
				            byte[] name1 = name.getBytes();
				            
				            System.out.println("Enter Employee Address");
				            String address = br.readLine(); 
				            byte[] add = address.getBytes();
	
			            	   	fout.write(id1);			  
			            		pout.print(", ");
			            		fout.write(name1);
			            		pout.print(", ");
			            		fout.write(add);
			            		pout.print(" ");
			            		pout.println("\n");
			            		System.out.println("Content is successfully wrote to the file.");
			            		fout.close();
			            }
			            catch(Exception e) {
			            	System.out.println("File does not exist.Enter correct file name.");
			            }
			            break;
			     case 3:
			            try {
				    	   	File f0 = new File("employee.txt");
				    	  	  
				    	  	System.out.println("Reading all data from file\n");
				    	
			            	  	FileInputStream fin = new FileInputStream(f0);

			            		int i;
			            		while((i=fin.read()) != -1) {
			            		System.out.print((char)i);
			            		}
			            		fin.close();
			          	  }
			           	 catch(Exception e) {
			            		System.out.println("File does not exist");
			          	  }
			           	 break;
			     case 4:
			    	     try {
			    	    	 	System.out.println("Enter file name to delete");
					    	String fname = br.readLine();
		            			File f = new File(fname);
		            			if(f.delete())
		            			{
		            			     System.out.println("file deleted : " + f.getName());
		            	 		}
		            	 		else
		            			 System.out.println("No such a file exist");
		            	
		                 	   }
		                 	catch(Exception e) {
		            	    		System.out.println(e);
		                	}  
			           	 break;
			           	 
			     case 5:
			    	 	try {
			    	 		System.out.println("Enter the file name to search ");    
	   	                		String fname = br.readLine();
	   	             			File f=new File(fname);
	   	              			if(f.exists())
	   	              			{
	   	                	 	System.out.println(f.getName() +" File is present at \""+f.getAbsolutePath()+"\"");

	   	                		}
	   	                 		else
	   	                		{
	   	                		 System.out.println("File not present");
	   	                 		}
	   	                		 System.out.println();
			    	 	     }
			    	 	     catch(Exception e) {
			    	 	     System.out.println("e");
			    	 	     }
	   	                           break;       
			     case 6:return;
			}
			
		}
		
		

}
}
