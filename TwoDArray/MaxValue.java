
public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,5,6,7,8,9};
        int max  = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
        {
            max = Math.max(max,arr[i]);
        }
        System.out.println("Max val is : "+max);
    }
}
