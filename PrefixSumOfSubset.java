public class PrefixSumOfSubset {
    public static void reverse(int arry[])
    {
        int prefix[] = new int[arry.length];
        int current_value = 0;
        int max_number = Integer.MIN_VALUE;
        prefix[0] = arry[0];
        for(int i = 1 ; i < prefix.length ; i++)
        {
            prefix[i] = prefix[i-1] + arry[i];//prefix of array ex= [1,3,2,4] = [1,4,6,10]; 1=1, 1+3=4,1+3+2=6
        }
        for(int i = 0 ; i < arry.length ; i ++)
        {
            int start = i;
            current_value = 0;
            for(int j = start ; j < arry.length ; j++)
            {
                int end = j; 
                current_value = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];//prefix[end] + prefix[start-1] this is a formula to find the sum of each subset
                System.out.println(prefix[end]);
                if(max_number < current_value)
                {
                    max_number = current_value;
                }
            }
            //System.out.println(current_value);
        }
        System.out.println("Max Number Is " + max_number);
    }
    public static void main(String args[])
    {
        int arry[] = {1,3,2};
        reverse(arry);
    }
}