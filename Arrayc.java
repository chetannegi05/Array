import java.util.*;
public class Arrayc {
    public static void main(String args[])
    {
        int arry[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of PCM:");
        arry[0] = sc.nextInt();
        arry[1] = sc.nextInt();
        arry[2] = sc.nextInt();
        System.out.println("Physics:- " + arry[0]);
        System.out.println("Chemistry:- " + arry[1]);
        System.out.println("Maths:- " + arry[2]);
        arry[2] = arry[2] + 1; //we can add the number in present array data
        arry[1] = 100; //we update the data of the array by the help of this
        System.out.println("Maths:- "+ arry[2]);
        System.out.println("Chemistry:- " + arry[1] );
        System.out.println("Length Of Array:- "+ arry.length);
        sc.close();
    }
}
