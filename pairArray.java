public class pairArray {
    public static void Pair(int arr[])
    {
        int tp=0;
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = i+1; j < arr.length ; j++)
            {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;// formula for total pair are n(n-1)/2;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:- " + tp);
    }
    public static void main(String args[])
    {
        int arry[] = {1,2,3,4,5,6};
        Pair(arry);
    }
}
