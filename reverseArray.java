public class reverseArray {
   public static void reverse(int ar[])
   {
    int start = 0;
    int last = ar.length-1;
    while(start<last)
    {
        int temp = ar[start];
        ar[start] = ar[last];
        ar[last] = temp;
        start++;
        last--;
    }
   } 
    public static void main(String args[])
    {
        int arry[] = {1,3,2,4,5};
        reverse(arry);
        for(int i = 0; i<arry.length; i++)
        {
            System.out.print(arry[i]+ " ");
        }
        System.out.println();
    }
}
