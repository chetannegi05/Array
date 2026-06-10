package Array;

public class TrappingRainWater {
    public static int trapping(int arry[])
    {

        int left_max[] = new int [arry.length];
        left_max[0] = arry[0];
        for(int i = 1 ; i < arry.length ; i++)
        {
            left_max[i] = Math.max(arry[i],left_max[i-1]);
        }

        int right_max[] = new int [arry.length];
        right_max[arry.length-1] = arry[arry.length-1];
        for(int i = arry.length-2 ; i >= 0 ; i--)
        {
            right_max[i] = Math.max(arry[i], right_max[i+1]);
        }
        int trapped_water = 0;

        for(int i = 0 ; i < arry.length ; i++)
        {

            int water_level = Math.min(right_max[i], left_max [i]);

            trapped_water += water_level - arry[i];
        }
        return trapped_water;
    }
    public static void main(String args[])
    {
        int arry[] = {4,2,0,6,3,2,5};
        int a = trapping(arry);
        System.out.println("The volume of trapped water is " + a);
    }
}
