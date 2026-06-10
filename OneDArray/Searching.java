package OneDArray;

import java.util.Scanner;

public class Searching {
    public static boolean search(int[][] arr, int key)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            for (int j = 0 ; j < arr.length ; j++)
            {
                if(arr[i][j] == key)
                {
                    System.out.println("Key at inex "+i+""+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int r=sc.nextInt();
        int c= sc.nextInt();
        int[][]arr = new int[r][c];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to find");
        int key = sc.nextInt();
        search(arr,key);
    }
}
