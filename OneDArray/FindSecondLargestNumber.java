package Array.OneDArray;

public class FindSecondLargestNumber {
    private static int findAns(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                second = num;
            }
        }
        return  second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 9,8,7,6,4,3,2,1};
        int ans = findAns(arr);
        System.out.println(ans);
    }
}
