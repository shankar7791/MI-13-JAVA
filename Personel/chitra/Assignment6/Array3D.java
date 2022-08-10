import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {

		int[][][] arr1 = new int[2][2][2];
		int[][][] arr2 = new int[2][2][2];
		int[][][] arr3 = new int[2][2][2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				{
					System.out.printf("Enter value for arr1[%d][%d][%d] : ",i,j,k);
					arr1[i][j][k] = sc.nextInt();
				}

			}
		}
		
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				{
					System.out.printf("Enter value for arr2[%d][%d][%d] : ",i,j,k);
					arr2[i][j][k] = sc.nextInt();
				}
			}			
		}

		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				{
					arr3[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
				}
			}			
		}
		
		System.out.println("\nPrinting first 3D Array : ");
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				System.out.print(arr1[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Printing second 3D Array : ");
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				System.out.print(arr2[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Addition of 3D Array is : ");
		for(int i = 0; i < 2; i++) 
		{
			for(int j = 0; j < 2; j++)
			{
				for(int k = 0; k < 2; k++)
				{
					System.out.print(arr3[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}


	}

}
