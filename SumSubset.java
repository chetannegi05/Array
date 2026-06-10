public class SumSubset {
    public static void sum(int arry[])
    {
        int current_value = 0;
        int max_number = Integer.MIN_VALUE;
        for(int i = 0 ; i < arry.length   ; i++)//for start
        {
            for(int j = i ; j < arry.length  ; j++)//for  end
            {
                current_value = 0;// yaha pr iss liye use krra haii bcz har subset k liye value xero s start hogi vrna sub set k liye glt aaege
                for(int k = i ; k <= j ; k++)//for sum of subset
                {
                    current_value = current_value + arry[k];
                }
                System.out.print(current_value + " ");
            }
            if(max_number < current_value)
            {
                max_number = current_value;
            }
        }   
        System.out.println("Maximum sum of an array is = " + max_number);
    }
    public static void main(String args[])
    {
        int arry[] = {1,-2,6,-1,3};
        sum( arry); // n(n+1)/2; for subarray of n\
    }
}