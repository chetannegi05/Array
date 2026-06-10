package Array.OneDArray;


class subArrayHighestLcm {

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static long maximumLCMSubarray(int[] arr) {
        int n = arr.length;
        long maxLCM = 0;

        for (int i = 0; i < n; i++) {
            long currLCM = 1;

            for (int j = i; j < n && j < i + 20; j++) {
                currLCM = lcm(currLCM, arr[j]);
                maxLCM = Math.max(maxLCM, currLCM);

                if (currLCM > 1e18){
                    break;
                }
            }
        }
        return maxLCM;
    }
    public static void main(String[] args) {
        long ans = maximumLCMSubarray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(ans);
    }
}
