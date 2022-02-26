

import java.util.*;
import java.io.*;

public class FileLinkList
{
   public static void main(String args[])throws IOException
   {
       String content = new String();
       int count=1;
       File file = new File("employee.txt");
       LinkedList<String> list = new LinkedList<String>();

       try {
    	   FileInputStream fin = new FileInputStream(file);
    	   Scanner sc = new Scanner(fin);
    	   while (sc.hasNextLine()){
    		   content = sc.nextLine();
    		   list.add(content);
    	   }
    	   sc.close();
       }catch(FileNotFoundException fnf){
    	   System.out.println(fnf);
       }
       Iterator<String> i = list.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
      
       
   }
}