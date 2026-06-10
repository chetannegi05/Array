package Array.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class TcsNqt {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int N = sc.nextInt();
        System.out.println("Enter Weight");
        int K = sc.nextInt();
        int[] s = new int[N];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < N; i++){
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        int ans=0;
        for (int i = 0; i < N; i++) {
            if(K < s[i]){
                break;
            }
            ans++;
            K=K-s[i ];
        }
        System.out.println("Ans is"+ " " + ans);
    }
}