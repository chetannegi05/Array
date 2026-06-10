public class stock {
    public static int stockin(int price[])
    {
        int buyprice = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0 ; i < price.length ; i++)
        {
            if(buyprice < price[i]) //profit
            {
                int profit =  price[i] - buyprice ;//todayprofit
                max_profit = Math.max(max_profit,profit);
            }
            else
            {
                buyprice = price[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[])
    {
        int price[] = {7,1,5,3,6,4};
        System.out.println( stockin(price));
    }
}
