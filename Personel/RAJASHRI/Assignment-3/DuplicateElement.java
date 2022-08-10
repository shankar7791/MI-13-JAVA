Q.Find out duplicate elements in array
import java.util.*;
public class DuplicateElement {

	public static void main(String[] args)
	{
		
		int[] arr=new int[7];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the 7 element-array["+i+"]:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicate Elements in array-");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					System.out.print(arr[i]+" ");
				}
			}
		}		

	}

}
//Here i used brute forse algorithm to find duplicate elemnts in array but its wastage of time as array traversing done at many times as well if we are giving more than two frequency of duplcate element then wont work properly
