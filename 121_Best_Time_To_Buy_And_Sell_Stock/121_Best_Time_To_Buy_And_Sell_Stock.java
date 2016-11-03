public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int length = prices.length;
        int min = prices[0];
        int result = 0;
        int temp;
        for(int price : prices){
            temp = price - min;
            result = temp>result?temp:result;
            min = price<min?price:min;
        }
        return result;
    }
}
