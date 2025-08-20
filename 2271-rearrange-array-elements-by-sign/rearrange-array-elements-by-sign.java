class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int pstart=0;
        int nstart=1;
       
        for(int element:nums){
            if(element>=0){
            arr[pstart]=element;
            pstart +=2;
            }
            else{
                arr[nstart]=element;
                nstart +=2;
            }
        }
        return arr;
    }
}