public class LargestandSmallestArray {
    public static int big(int a[])
    {
        int largest = Integer.MIN_VALUE; //it is used for -infinite and Integer.MAX_VALUE is used for +infinte
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length ; i++)
        {
            if(largest < a[i])
            {
                largest = a[i];
            }
            if (smallest > a[i]) {
                smallest = a[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
        return largest;
    }
    public static void main(String args[])
    {
        int arry[] = {12,34,21,35,55,2};
        int a = big(arry);
        System.out.println("Largest number in the array is "+ a);
    }
}
