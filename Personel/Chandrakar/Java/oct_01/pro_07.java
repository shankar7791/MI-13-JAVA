//First take 10 inputs from user then print array in order Ascending and Descending.
import java.util.*;
class Ascending
{
    public static void main(String[] args)
      {
        int [] arr = new int [10];     
        int temp = 0;    
        
        Scanner obj = new Scanner(System.in);
           
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < 10; i++)
        {     
            arr[i] = obj.nextInt();   
        }    
            
        
        for (int i = 0; i < 10; i++) {     
            for (int j = i+1; j < 10; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < 10; i++) {     
            System.out.print("|" + arr[i] );    
        }    
        System.out.print("|\n\n");  
        
        System.out.println("Elements of array sorted in dcending order: ");    
        for (int i = 9; i >= 0  ; i--) {     
            System.out.print("|" + arr[i]);    
        }    
        System.out.print("|\n"); 
    }  
    
} 
