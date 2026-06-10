import java.util.Scanner;

public class CloserGreatestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of a Array");
        int r = sc.nextInt();
        int[] arr = new int[r];
        System.out.println("Enter the Element in Array");
        for(int i = 0; i < r; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array  is ");
        for(int i = 0; i < r; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the element");
        int n = sc.nextInt();
        for(int i = 0; i < r; i++)
        {
            for(int j = i+1; j < r; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is ");
        for(int i = 0; i < r; i++)
        {
            System.out.print(arr[i] );
        }
        if (n < arr[0]) {
            System.out.println("The number is smaller than the smallest element.");
            System.out.println("Greatest Element: " + arr[0]);
        } else if (n > arr[r - 1]) {
            System.out.println("The number is greater than the largest element.");
            System.out.println("Lowest Element: " + arr[r - 1]);
        }
        else
        {
            int i = 1;
            while(i< r)
            {
                if(n<arr[i])
                {
                    i++;
                }
                else
                {
                    System.out.println("Lowest Element is " + arr[i-1]);
                    System.out.println("Greatest Element is " + arr[i]);
                    break;
                }
            }
        }
    }
}
