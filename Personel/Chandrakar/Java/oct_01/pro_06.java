//Find largest and smallest elements of an array.

class largesmall
{
    public static void main(String[] args)
    {
        int large, small, i;
        int arr[] = new int[]{10, 20, 30, 40, 50};
        large = small = arr[0];
        for( i = 0; i < 5; i++)
            {
                if(large < arr[i])
                {
                    large = arr[i];
                }

                if(small > arr[i])
                {
                    small = arr[i];
                }
                   
            }

        System.out.println("Large element is  : " + large);  
        System.out.println("small element is  : " + small);  
       
            
    }
}