package OneDArray;

import java.util.Scanner;

public class SumOfDiagonals {
    public static int primaryDiagonal(int[][] arr)
    {
        int sum=0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length ; j++)
            {
                if(i == j)
                {
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println("Primary sum is "+sum);
        return sum;
    }
    public static int secondaryDiagonal(int[][] arr)
    {
        int sum = 0;
        for(int i  = 0 ; i < arr.length ; i++ )
        {
            for(int j = 0 ; j < arr.length ; j++)
            {
                if(i+j == arr.length-1)
                {
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println("Secondary sum is "+sum);
        return sum;
    }
    public static void bothDiagonalSum(int[][] arr)
    {
        int pSum=0;
        int sSum=0;
        pSum = primaryDiagonal(arr);
        sSum = secondaryDiagonal(arr);
        System.out.println("Both sum is "+(pSum+sSum));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ans column of the array");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the element in array");
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        bothDiagonalSum(arr);
    }
}
