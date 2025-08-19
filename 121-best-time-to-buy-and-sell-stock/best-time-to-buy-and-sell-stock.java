class Solution {
    public int maxProfit(int[] prices) {
       for(int i=0;i<prices.length-1;i++){
          prices[i]=prices[i+1]-prices[i];
       }
       int largest=Integer.MIN_VALUE;
       int sum=0;
       for(int i=0;i<prices.length-1;i++){
          sum +=prices[i];
          if(sum<0){
             sum=0;
          }
          if(sum>largest){
            largest=sum;
          }
       }
       if(largest==Integer.MIN_VALUE){
        return 0;
       }
       return largest;
    }
}