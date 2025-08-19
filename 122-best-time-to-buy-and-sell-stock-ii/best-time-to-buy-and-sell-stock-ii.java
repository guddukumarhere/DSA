class Solution {
    public int maxProfit(int[] prices) {
       for(int i=0;i<prices.length-1;i++){
          prices[i]=prices[i+1]-prices[i];
       }
       int sum=0;

       for(int i=0;i<prices.length-1;i++){
          if(prices[i]>=0){
            sum +=prices[i];
          }
       }
       return sum;
    }
}