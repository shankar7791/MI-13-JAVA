//Q.Multiplication of two matrix
import java.util.Scanner;
public class MatrixProd {

	public static void main(String[] args) 
	{
		

		     int i, j, k, sum=0;
		      int[][] first = new int[3][3];
		      int[][] second = new int[3][3];
		      int[][] res = new int[3][3];
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.print("Enter 9 Elements of First Matrix: ");
		      for(i=0; i<3; i++)
		      {
		         for(j=0; j<3; j++)
		         {
		            first[i][j] = scan.nextInt();
		         }
		      }
		      System.out.print("Enter 9 Elements of Second Matrix: ");
		      for(i=0; i<3; i++)
		      {
		         for(j=0; j<3; j++)
		         {
		            second[i][j] = scan.nextInt();
		         }
		      }
		      
		      // multiplying the two matrices
		      for(i=0; i<3; i++)
		      {
		         for(j=0; j<3; j++)
		         {
		            sum = 0;
		            for(k=0; k<3; k++)
		            {
		               sum = sum + (first[i][k] * second[k][j]);
		            }
		            res[i][j] = sum;
		         }
		      }
		      
		      System.out.println("\nMultiplication Result of Two Matrices is:");
		      for(i=0; i<3; i++)
		      {
		         for(j=0; j<3; j++)
		         {
		            System.out.print(res[i][j]+ "  ");
		         }
		         System.out.print("\n");
		      }
		   
		}

		
	}

