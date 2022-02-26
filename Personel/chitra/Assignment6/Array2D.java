import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] arr1 = new int[2][2];
		int[][] arr2 = new int[2][2];
		int[][] arr3 = new int[2][2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.printf("Enter value for arr1[%d][%d] : ",i,j);
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.printf("Enter value for arr2[%d][%d] : ",i,j);
				arr2[i][j] = sc.nextInt();
			}			
		}

		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}			
		}
		
		System.out.println("Printing first 2D Array : ");
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Printing second 2D Array : ");
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of 2D Array is : ");
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
