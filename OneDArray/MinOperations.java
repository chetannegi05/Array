package Array.OneDArray;

import java.util.Arrays;

public class MinOperations {
    private static int findAns(int[] arr){
        Arrays.sort(arr);
        int ans=0;
        int median = arr[arr.length/2];
        System.out.println(median);
        for(int i : arr){
            ans+=Math.abs(i-median);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6};
        int ans = findAns(arr);
        System.out.println(ans);
    }
}
