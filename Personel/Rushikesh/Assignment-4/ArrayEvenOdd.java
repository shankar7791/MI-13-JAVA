import java.util.*;

public class ArrayEvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 20, even = 0, odd = 0; 
        int i;     
        
        int arr[] = new int[n];

        System.out.println("Enter 20 elements of the array :");

        for( i = 0; i < n; i++)  

        {
            arr[i] = sc.nextInt();
                
        }
        for (i =0; i <  arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            
            {
              even ++;
            }
            else
            {
               odd ++;
            }
        }
        System.out.println("Total number of Even Numbers in this Array ="+ even );
        System.out.println("Total number of Odd Numbers in this Array ="+ odd);
        
    }
}   