class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int len = prices.length;
        int i = 0, j = 1;


        while(j < len){
            if(prices[i] > prices[j]){
                i++;
            }else{
                int profit = Math.abs(prices[i] - prices[j]);
                maxProfit = Math.max(maxProfit, profit);
                j++;
            }
        }

        return maxProfit;
    }
}