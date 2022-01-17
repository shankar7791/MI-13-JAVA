class Multiplication
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1, 2, 3},{4, 5, 6}};
        int arre[][] = {{1, 2, 3},{4,5,6}};
        int ab[][] = new int[2][3];

        for (int a = 0; a < 2; a++)
        {
            System.out.print("|");
            for(int b = 0; b < 3; b++)
            {
                System.out.print(arr[a][b] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("\n   *\n");
        for (int a = 0; a < 2; a++)
        {
            System.out.print("|");
            for(int b = 0; b < 3; b++)
            {
                System.out.print(arre[a][b] + " ");
            }
            System.out.println("|");
        }

        System.out.println("\n  =");

        for(int i = 0; i < 2; i++)
        {
            System.out.print("|");
            for(int j = 0; j < 3; j++)
            {
            ab[i][j] = arr[i][j] * arre[i][j];
            System.out.print(ab[i][j] + " ");
            }
            System.out.println("|");

        }
        
    }
}