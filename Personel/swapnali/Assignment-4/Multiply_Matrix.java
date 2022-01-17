/*.....Multiply two Matrix......*/


import java.util.Scanner;

public class Multiply_Matrix 
{
	
	public static void main(String[] args) 
	{
		int a,b,i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of rows");
	 a = sc.nextInt();
	
	System.out.println("Enter no. of colms");
	 b = sc.nextInt();
	
	int arr1[][] = new int[a][b];
	int arr2[][] = new int[a][b];
	int sum[][] = new int[a][b];
	
	System.out.println("Enter elements of First Matrix");
	
	for( i = 0 ; i < a ; i++ )
	
		for(j = 0 ; j < b ; j++ )
			arr1[i][j] = sc.nextInt();
		
	System.out.println("Enter elements of second Matrix");

	for( i = 0 ; i < a ; i++ )
		
		for( j = 0 ; j < b ; j++ )
			arr2[i][j] = sc.nextInt();
	
	
	for( i = 0 ; i < a ; i++ )
	
		for( j = 0 ; j < b ; j++ )
			sum[i][j] = arr1[i][j] * arr2[i][j];
		
	System.out.println("Sum of matrix :" );
	
	for( i = 0 ; i < a ; i++ )
	{	
		for(j = 0 ; j < b ; j++ )
			System.out.println(sum[i][j]+ "\t");
		
		System.out.println();
	}

	}


}
