package TwoDArray;

import java.util.Scanner;

public class BruteSetMatrixZero {
    public static void matRow(int i , int[][] mat,int r)
    {
        for(int j=0;j<r;j++)
        {
            if(mat[i][j] != 0)
            {
                mat[i][j] = -1;
            }
        }
    }
    public static void matCol(int j , int[][] mat,int c)
    {
        for(int i=0;i<c;i++)
        {
            if(mat[i][j] != 0)
            {
                mat[i][j] = -1;
            }
        }
    }
    public static void main(String[] args) {
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
        for(int i  =0 ; i < r ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if(mat[i][j] == 0)
                {
                    matRow(i,mat,r);
                    matCol(j,mat,c);
                }
            }
        }
        for(int i  =0 ; i < r ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if(mat[i][j] == -1)
                {
                    mat[i][j] = 0;
                }
            }
        }
        for(int i  =0 ; i < r ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
        }
    }
}
//[[1,1,1],[1,0,1],[1,1,1]]