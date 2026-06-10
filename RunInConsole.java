import static java.lang.Math.sqrt;

public class RunInConsole {
    public static boolean isprime(int a )
    {
        if(a<=1)
        {
            return false;
        }
        else
        {
            for(int i = 2;i <= sqrt(a);i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(args.length==0)
        {
            System.out.println("Enter any number");
            return;
        }
        int a = Integer.parseInt(args[0]);
        if (isprime(a))
        {
            System.out.println("IsPrime");
        }
        else
        {
            System.out.println("Not IsPrime");
        }
    }
}
