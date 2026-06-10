package OneDArray;

import java.util.*;

public class PermutationGenerator {

    static void generatePermutations(int[] arr, int index) {
        if (index == arr.length) {

            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1);
            swap(arr, index, i);  // Backtrack (swap back)
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("All permutations are:");
        generatePermutations(arr, 0);

        sc.close();
    }
}
