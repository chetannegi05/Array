public class TrappedWater {
    private static int trapped(int[]arr){
        int[] leftHeight = new int[arr.length];
        int n = arr.length;
        leftHeight[0] = arr[0];
        for(int i = 1  ; i < arr.length ; i++){
            leftHeight[i] = Math.max(leftHeight[i-1],arr[i]);
        }

        int[] rightHeight = new int[arr.length];
        rightHeight[n-1] = arr[n-1];
        for(int i = n-2  ; i >= 0 ; i--){
            rightHeight[i] = Math.max(rightHeight[i+1],arr[i]);
        }
        int trapped = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int waterLevel = Math.min(leftHeight[i],rightHeight[i]);
            trapped+=waterLevel-arr[i];
        }
        return trapped;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        System.out.println(trapped(arr));
    }
}
