import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingSwitchCase {
	
	static void getMatrix(int a[][],int x,int y)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < x; i++) 
		{
			for(int j = 0; j < y; j++)
			{
				System.out.printf("Enter array values arr[%d][%d] : ",i,j);
				a[i][j] = sc.nextInt();
			}
		}
	}
	
	static void printMatrix(int x[][],int m,int n)
	{
		for(int i = 0; i < m; i++) 
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n1.Add two matrices of same size\n2.Find duplicate integer values of an array"
				           + "\n3.Remove duplicate elements of an array\n4.Multiplication of two matrices");
		
		System.out.println("\nEnter your choice : ");
		int ch = sc.nextInt();
		
		switch (ch)
		{
		
			case 1 :
					int[][] arr1 = new int[2][2];
					int[][] arr2 = new int[2][2];
					int[][] arr3 = new int[2][2];

					System.out.println("\nfirst matrix");
					getMatrix(arr1,2,2);
					
					System.out.println("\nsecond matrix");
					getMatrix(arr2,2,2);

					for(int i = 0; i < 2; i++) 
					{
						for(int j = 0; j < 2; j++)
						{
							arr3[i][j] = arr1[i][j] + arr2[i][j];
						}			
					}
			
					System.out.println("\nPrinting first matrix : ");
					printMatrix(arr1,2,2);
			
					System.out.println("\nPrinting second matrix : ");
					printMatrix(arr2,2,2);
			
					System.out.println("\nAddition of two matrices is : ");
					printMatrix(arr3,2,2);
					break;
					
			case 2:
				    System.out.println("Enter size of an array ");
				    int size = sc.nextInt();		
				   
				    int[] arr = new int[size];
				   
				    System.out.printf("\nEnter %d array elements : ",size);
				    for(int i = 0; i < arr.length; i++)
				    {
					   arr[i] = sc.nextInt();
				    }
				   
				    System.out.print("Original array is : ");
				    for(int i = 0; i < arr.length; i++)
				    {
				    	System.out.print(arr[i] + " ");
				    }

				    System.out.print("\n\nDuplicate elements from array is : ");
				    for (int i = 0; i < arr.length; i++)
				    {
				    	for(int j = i + 1; j < arr.length; j++)
				    	{
				    		if(arr[i] == arr[j])
				    		{
				    			System.out.print(arr[j] + " ");							   
				    		}
				    	}
				    }
				    break;
			case 3:  
					System.out.println("Enter size of an array ");
					int len = sc.nextInt();		
		   
					int[] ar = new int[len];
					int[] temp = new int[len];
			 		   
					System.out.printf("\nEnter %d array elements : ",len);
					for(int i = 0; i < ar.length; i++)
					{
						ar[i] = sc.nextInt();
					}
		   
					System.out.print("Original array is : ");
					for(int i = 0; i < ar.length; i++)
					{
						System.out.print(ar[i] + " ");
					}
			  
					Arrays.sort(ar);
			  
					int j = 0;
					for(int i = 0; i < ar.length - 1;i++)
					{
						if(ar[i] != ar[i + 1])
						{
							temp[j++] = ar[i];
						}
					}
			  
					temp[j++] = ar[len - 1];
			  
					System.out.print("\nArray after removing duplicate elements is :");
					for(int i = 0; i < j;i++)
					{
						ar[i] = temp[i];
						System.out.print(ar[i] + " ");
					}
					break;
			  
			case 4:	
					int a[][] = new int[3][4];
					int b[][] = new int[3][4];
					int c[][] = new int[3][4];
					
					System.out.println("\nfirst matrix");
					getMatrix(a,3,3);
					
					System.out.println("\nsecond matrix");
					getMatrix(b,3,3);
					
					System.out.println("\nprinting first matrix : ");
					printMatrix(a,3,3);
					
					System.out.println("\nprinting second matrix : ");
					printMatrix(b,3,3);
					
					for (int l = 0; l < 3; l++)
					{
			            for (int m = 0; m < 3; m++) 
			            {
			                for (int n = 0; n < 3; n++)
			                {
			                	 c[l][m] += a[l][n] * b[n][m];
			                }
			            }
			        }
					
					System.out.println("\nMatrix multiplication : ");
					printMatrix(c,3,3);
					break;
					
		 default :System.out.println("Enter correct choice ");
					
				   
		}

	}

}
