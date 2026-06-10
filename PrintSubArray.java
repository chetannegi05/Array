public class PrintSubArray {
    public static void subarray(int arry[])
    {
        int temp = 0;
        for(int i = 0 ; i < arry.length ; i++)
        {
            for (int j = i ; j < arry.length ; j++)
            {
                for(int k = i ; k <= j ; k++)
                {
                    System.out.print(  arry[k]);
                }
                System.out.println();
            }
            System.out.println();
            temp = temp + arry[i];
            System.out.print("Sum of subset of array are = " + temp);
        } 
    }
    public static void main(String args[])
    {
        int arry[] = {1,2,3,4,5,9};
        subarray(arry);
    }
}