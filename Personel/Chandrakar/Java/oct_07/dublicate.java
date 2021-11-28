 
class Dublicate 
{
  public static void main(String[] args) 
    {
        int[] arr = new int[]{20, 20, 30, 40, 50, 50, 50};
 
        for (int i = 0; i < 5; i++)
        {
            for (int j = i+1; j < 6; j++)
            {
                if (arr[i] == arr[j])
                {
                    
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }    
}
