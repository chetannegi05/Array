public class BinarySearch {
    public static int Search(int a[],int key )
    {
        int start = 0;
        int end = a.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            System.out.println(mid);
            if(a[mid] == key)
            {
                return mid;
            }
            if(a[mid] < key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arry[] = {1,2,3,4,5,6};
        int key = 3;
        int a = Search(arry, key);
        System.out.println(key + " is present at index " + a);
    }
}