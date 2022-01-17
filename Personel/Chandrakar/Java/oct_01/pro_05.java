//Write a program to find the sum and product of all elements of an array
class Sumproduct
{
    public static void main(String[] args)
    {
        
        int arr[] = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < 5; i++)
            {
                
                sum = sum + arr[i];       
            }
        System.out.println("Sum of Array values : " + sum);
            
    }
}