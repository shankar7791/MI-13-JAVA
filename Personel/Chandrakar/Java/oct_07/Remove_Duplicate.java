class Remove_Duplicate 
{

	public static void main(String[] args) 
	{
		int[] a = {20,20,30,40,50,50,50}; 
		int j = 0;
		int i = 0;
		int k = 0;
		
		while(i< 6)
		{
		
		if (a[i] != a[i+1])
			 {
				 a[j] = a[i];
				 j++;	 
			 }
			 
			 i++;
		}
		
		 a[j] = a[4];
		 
		 while(k < j+1)
		 {
		 System.out.println(a[k]+ " ");
		 k++;
		 }
		 
		
		 
	}

}
