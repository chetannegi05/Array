package Array.OneDArray;

import java.util.Scanner;

public class ReverseWholeArrayKtimes {
    private static void reverse(int[] arr, int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }


    private static void reverseKtimes(int[] arr, int k) {
        int n  = arr.length;
        int end = k%n;
        reverse(arr, 0, end-1);
        reverse(arr, end, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverseRightKtimes(int[] arr, int k) {
        int n  = arr.length;
        int end = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, end-1);
        reverse(arr, end, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter the value of k:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
//        reverseKtimes(arr,k);
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//        System.out.println();

        reverseRightKtimes(arr,k);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
