package Array.OneDArray;

public class MajorityElement {
    public static int foundMajorityElement(int[] arr) {
        int majority = arr[0];
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(count == 0){
                majority = arr[i];
                count=1;
            }
            else if(arr[i] != majority){
                count--;
            }
            else{
                count++;
            }
        }
        return majority;
    }
    static void main() {
        int[] arr = {5,1,7,7,5,7,2,7,7};
        int ans = foundMajorityElement(arr);
        System.out.println(ans);
    }
}
