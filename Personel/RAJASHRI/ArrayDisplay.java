package work;
import java.util.Scanner;
public class ArrayDisplay 
{

	public static void main(String[] args) 
	{
		
			int[] numbers=new int[5];
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the number of elements u want to add:" );
		    int n=sc.nextInt();
		    
		    for(int i=0;i<n;i++)
		    {
		      System.out.print("Enter the value for arr["+i+"]:");
		      numbers[i]=sc.nextInt();	
		    }
		   
		    System.out.println("Array elements are:");
		    for(int i=0;i<n;i++)
		    {
		    	System.out.println(numbers[i]);
		    }
		    
		   //sort array                               4, 2, 8, 3, 5
		    for(int i=0;i<n;i++)
		    {  
		    	for(int j=i+1;j<n;j++)
		    	{
			    	if(numbers[i]>numbers[j])
			    	{
			    		int temp=numbers[i];
			    		numbers[i]=numbers[j];
			    		numbers[j]=temp;
			    	}
		     
		         }
		    }
		    System.out.println("Array elements are:");
		    for(int i=0;i<n;i++)
		    {
		    	System.out.println(numbers[i]);
		    }
		    
              
	}

}
