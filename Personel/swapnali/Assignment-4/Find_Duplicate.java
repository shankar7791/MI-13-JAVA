/*.................Find Duplicate........*/
public class Find_Duplicate 
{

	public static void main(String[] args)
	{
		int[] a = {3,5,4,3,2,2,1};
		
		System.out.print("Duplicate values are :");
		
		for(int i = 0; i< a.length-1; i++)
		{
			for(int j = i+1; j< a.length; j++)
			{
				if ((a[i]==a[j]) && (i!=j))
				{
					System.out.println(a[j]+ ",");
				}
			}
		}
	}

}
