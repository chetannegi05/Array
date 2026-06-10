package Array.OneDArray;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        ArrayList<Integer> arr = new ArrayList<>();
        int count = 1;
        int last = end[0];
        arr.add(0);
        for(int i = 1 ; i < end.length ; i++)
        {
            if(start[i] >= last)
            {
                count++;
                last = end[i];
                arr.add(i);
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.print("A" + arr.get(i) + " ");
        }
    }
}
