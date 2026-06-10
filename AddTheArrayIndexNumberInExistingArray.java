public class AddTheArrayIndexNumberInExistingArray {
    public static void main(String[] args) {
        int[] arry1 = {1,2,3,4,5};
        int[] arry2 = {6,7,8,9,10,11};
        int min = Math.min(arry2.length,arry1.length);
//       int max2 = 0;
//       if(arry2.length > arry1.length)
//       {
//           min2 = arry1.length;   // yh bhii kr skta haii min find krne k liye
//       }
//       else {
//           min2 = arry2.length;
//    }
        for(int  i = 0 ; i < min ; i++)
        {
            arry1[i] = arry1[i] + arry2[i];
        }
        for(int print : arry1)
        {
            System.out.println(print);
        }
    }
}
