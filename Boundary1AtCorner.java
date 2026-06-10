import java.util.Scanner;

public class Boundary1AtCorner {
    public static boolean Check(int[][]arr,int r,int c)
    {
        int[][] arr2 = new int[r][c];
        int check = 0;
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                if((i==0) || (j==r-1) || (i == r-1) || (j == 0))
                {
                    arr2[i][j] = 1;
                }
                else
                {
                    arr2[i][j] = 0;
                }
            }
        }
        System.out.println("Second Matrix to check ");
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                System.out.print(arr2[i][j]);
            }
            System.out.print("\n");
        }
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                if(arr[i][j] != arr2[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]arr = new int[r][c];
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        if(Check(arr,r,c))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
