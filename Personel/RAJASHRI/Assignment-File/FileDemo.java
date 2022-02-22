
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FileDemo {

	public static void main(String[] args) throws IOException 
	{
		
		int ch,i;
		File f;
		String fname;
		String data;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		 System.out.println("\n1.Create a file\n2.Write or append into file\n3.Read the content from File\n4.delete File\n5.Search\nEnter your choice\n");
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 ch=sc.nextInt();
		   switch(ch)
		   {
		   	 case 1: System.out.println("Enter the file name to create: ");
		   	         fname=br.readLine();
		   	         f=new File(fname);
		   	         
		   	         if(f.createNewFile())
		   	         {
		   	        	 System.out.println(f.getName() +"File craeted successfully");
		   	         }
		   			  else
		   			  { 
			          System.out.println("Error in file createion");
		   			  }
		   	      System.out.println();
		   	        	break;
		   	 case 2: System.out.println("Enter the file name to write ");
		   	         fname=br.readLine();
		   	         FileOutputStream fout=new FileOutputStream(fname,true);
		   	         System.out.println("Enter ur data to write into file");
		   	         data=br.readLine();
		   	         byte b[]=data.getBytes();
		   	         fout.write(b);
		   	         System.out.println();
		   	         break;
		   	 case 3: System.out.println("Enter the file name to read: ");
		   	         fname=br.readLine();
		   	         // System.out.println(fname);
		   	         FileInputStream fin=new FileInputStream(fname);    
		             while((i=fin.read())!=-1)
		              {  
		            	  System.out.print((char)i);
		              }
		             System.out.println();
		             break;
		   	 case 4:System.out.println("Enter the file to delete ");
		   	        fname=br.readLine();
		   	        f=new File(fname);
		   	        if(f.delete())
		   	        {
		   	        	System.out.println("Successfully deleted the "+f.getName()+" File");
		   	        }
		   	        else
		   	        {
		   	        	System.out.println("Error in deletion");
		   	        }
		   	        System.out.println();
		   	        break;
		   	 case 5: System.out.println("Enter the file to search ");    
		   	         fname=br.readLine();
		   	         f=new File(fname);
		   	         if(f.exists())
		   	         {
		   	        	 System.out.println(f.getName() +" File is present at \""+f.getCanonicalPath()+"\"");
		   	        	 
		   	         }
		   	         else
		   	         {
		   	        	 System.out.println("File not present");
		   	         }
		   	         System.out.println();
		   	         break;
		   	 default:System.out.println("U entered wrong choice");
			         
		   }
		}   
		

	}

}
