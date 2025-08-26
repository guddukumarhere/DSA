class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] !=0){
                arr[count]=nums[i];
                count++;
            }
        }
        for(int j=0;j<n;j++){
            nums[j]=arr[j];
        }
    }
}