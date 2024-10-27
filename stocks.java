import java.util.*;
public class stocks {
    public static void max_profit(int sell_price[]){
        int buy_price=Integer.MAX_VALUE;
        int maximum_profit=0;
        for(int i=1;i<sell_price.length;i++){
            int profit=0;
            if(buy_price<=sell_price[i]){
                profit=sell_price[i]-buy_price;
            }
            else{
                buy_price=sell_price[i];
            }
            maximum_profit=Math.max(maximum_profit, profit);
        }
        for(int i=0;i<sell_price.length;i++){
            if(buy_price==sell_price[i]){
                System.out.println("the best day for buy a stock to get maximum profit is "+(i+1));
                break;
            }
        }
        System.out.println("maximum profit is "+ maximum_profit);

    }
    public static void main(String[] args) {
        int sell_price[]={2,3,6,5,4,2};
        max_profit(sell_price);
    }
}
