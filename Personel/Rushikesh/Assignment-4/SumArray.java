import java.util.*;

class SumArray
{	
	
	public static void main(String args[])
	{
	   	Scanner sc = new Scanner(System.in);
        	int n;   
        	System.out.println("Enter the number of elements :");
      		 n = sc.nextInt();    
       	    
        	int arr[] = new int[n];
        	
        	System.out.println("Enter the elements of the array :");

        	for(int i = 0; i < n; i++)  

       	 {
            		arr[i] = sc.nextInt();
        	 }	
		
		sum(arr);
	
	}

	public static void sum(int[] arr)
	{
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++)
			sum+=arr[i];
		
		System.out.println("sum of array values : " + sum);
	}
}

