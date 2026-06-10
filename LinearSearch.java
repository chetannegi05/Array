public class LinearSearch {
    public static int search(int a[] , int k)
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] == k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arry[] = {12,21,11,45,65,44,89};
        int key = 44;
        int index = search(arry, key);
        if(index == -1)
        {
            System.out.println("Key Is Not Present");
        }
        else
        {
            System.out.println("Key is present in index " + index );
        }
    }

}