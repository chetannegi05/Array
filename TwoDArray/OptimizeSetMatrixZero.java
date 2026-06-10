package TwoDArray;

import java.util.Scanner;

public class OptimizeSetMatrixZero {
    public static void main(String[] args) {
        int col0 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i  =0 ; i < r ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if(mat[i][j] == 0)
                {
                    mat[i][0] = 0;
                    if(j!=0)
                    {
                        mat[0][j] = 0;
                    }
                    else
                    {
                        col0 = 0;
                    }
                }
            }
        }
        for(int i = 1 ; i < r ; i++)
        {
            for(int j = 1 ; j < c ; j++)
            {
                if(mat[i][j] != 0)
                {
                    if(mat[0][j] == 0 || mat[i][0] == 0)
                    {
                        mat[i][j] = 0;
                    }
                }
            }
        }
        if(mat[0][0] == 0)
        {
            for (int j = 0; j < c; j++)
            {
                mat[0][j] = 0;
            }
        }
        if (col0 == 0)
        {
            for (int i = 0; i < r; i++)
            {
                mat[i][0] = 0;
            }
        }
        System.out.println("Final Matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//[[0,1,2,0],[3,4,5,2],[1,3,1,5]]