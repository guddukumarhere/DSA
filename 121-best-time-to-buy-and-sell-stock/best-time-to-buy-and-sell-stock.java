class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int len=prices.length;
        for(int startFrom=1; startFrom<len;startFrom++){
            int cost=prices[startFrom]-min;
            if(cost>profit){
                profit=cost;
            }
            if(min>prices[startFrom]){
                min=prices[startFrom];
            }
        }
        return profit;
    }
}