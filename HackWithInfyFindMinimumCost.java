import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HackWithInfyFindMinimumCost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");
        int num = Integer.parseInt(br.readLine());
        List<Integer> A = new ArrayList<>();
        System.out.println("Enter the elements of the array");
        for (int i = 1; i <= num ; i++)
        {
            int n = Integer.parseInt(br.readLine());
            A.add(n);
        }


        PriorityQueue<Integer> q = new PriorityQueue<>();
        while (!A.isEmpty())
        {
            int a = A.remove(0);
            q.add(a);
        }
        System.out.println(q);
    }
}
