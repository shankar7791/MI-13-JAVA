import java.util.*;

public class ArrayExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 10; 
        int m,i;     
        
        int arr[] = new int[n];

        System.out.println("Enter 10 elements of the array :");

        for( i = 0; i < n; i++)  

        {
            arr[i] = sc.nextInt();
                
        }
        
        System.out.println("Enter 1 to display enterd array elements.");
        System.out.println("Enter 2 for search the enter number is present or not in this array.");
        System.out.println("Enter 3 to display entered array elements in revers order.");
        System.out.println("Enter 4 to find sum and product of all elements of array.");
        System.out.println("Enter 5 to display largest and smallest element of array.");
        System.out.println("Enter 6 to display array in assending and decending order.");
        System.out.println("");

        m = sc.nextInt();

        switch(m)
        {
            case 1:
            System.out.println("enterd array elements are :");
            for ( i = 0; i < arr.length; i++) 
            
            {      
                System.out.print(arr[i] +" " );   
            }
            break;

            case 2:
            {
                int p , flag =0 ;
                System.out.println("Enter the Number");
                  
                Scanner sc1 = new Scanner (System.in);
                   p= sc1.nextInt();
                for ( i = 0; i < n; i++)
                {
                    if (arr[i] == p)
                    {
                        flag = 1;
                        break;
                    }
                    else
                    {
                        flag=0;
                    }

                }
                    if(flag == 1)
                    {
                        System.out.println("Enter number is present");
                
                    }else
                    {
                        System.out.println("Enter number is not present");
                
                    }

            }
            break;

            case 3:
            {
                System.out.println("Original array are :");
                for ( i = 0; i < arr.length; i++) 
                
                {      
                    System.out.print(arr[i] +" " );   
                }
                System.out.println("");

                System.out.println("Array in revers order are :");

                for (i = arr.length-1;i>=0;i--)
                {
                    System.out.print(arr[i]+" ");
                }

            }
            break;

            case 4:
            {  int sum =0 , product = 1;
                for ( i = 0; i < n; i++)
                {
                   sum = sum + arr[i];

                   product = product * arr[i];
                }
                   System.out.println("sum :" + sum);

                   System.out.println("Product :" + product);
                {
                   
                }
                
            }
            break;

            case 5:
            {
                int small = arr[0];
                int large = arr[0];

                for (i = 1; i < arr.length; i++)
                {
                    if(arr[i] > large)
                    large = arr[i];
                    else if (arr[i] < small)
                    small = arr[i];

                }
                System.out.println("Smallest Number in array :" + small);

                System.out.println("Largest Number in array :" + large);
            }
            break;

            case 6:
            {
                int temp = 0;   
        
                 for ( i = 0; i < arr.length; i++)   
                 {     
                    for (int j = i+1; j < arr.length; j++)     
                     {     
                         if(arr[i] > arr[j]) 
                        {    
                         temp = arr[i];    
                         arr[i] = arr[j];    
                         arr[j] = temp;    
                        }     
                     }     
                 }    
          
                     System.out.println();    
            
           
                 System.out.println("Elements of array sorted in ascending order: ");  
                   
                    for ( i = 0; i < arr.length; i++) 
                     {     
                         System.out.print(arr[i] + " ");    
                     }  
                         for ( i = 0; i < arr.length; i++)   
                        {     
                            for (int j = i+1; j < arr.length; j++)    
                            {     
                             if(arr[i] < arr[j]) 
                             {    
                                temp = arr[i];    
                                arr[i] = arr[j];    
                                arr[j] = temp;    
                             }     
                            }     
                        }    
          
                            System.out.println();    
            
                            System.out.println("Elements of array sorted in descending order: "); 
           
                    for ( i = 0; i < arr.length; i++) 
                    {     
                        System.out.print(arr[i] + " ");    
                     }    
               
            }
            break; 

        }
        
    }
}