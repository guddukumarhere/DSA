class Solution {
    public int maxSubArray(int[] nums) {
      int largest=Integer.MIN_VALUE;
      int sum=0;
      if(nums.length==0){
        return 0;
      }
      for(int i=0;i<nums.length;i++){
         sum +=nums[i];
         if(largest<sum){
            largest=sum;
         }
         if(sum<0){
            sum=0;
         }
      }
       return largest; 
    }
}