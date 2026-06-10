public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,3,4};
        System.out.println(removeDup(arr));
    }
    public static int removeDup(int[] arr){
        int i = 0;
        for(int j = 1 ; j < arr.length;j++){
            if(arr[i]<arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }
        return i+1;
    }
}
