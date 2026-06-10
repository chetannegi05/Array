package Array;

public class kadaneAlgo
{
    public static void main(String[] args)
    {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            sum = Math.max(arr[i], sum + arr[i]);
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
