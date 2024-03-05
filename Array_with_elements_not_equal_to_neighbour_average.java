class Solution {
    public int[] rearrangeArray(int[] nums) {
   int i=1;
   while(i<nums.length-1){
       if(i>0 && nums[i-1]+nums[i+1]==2*nums[i]){
           int temp=nums[i];
           nums[i]=nums[i+1];
           nums[i+1]=temp;
           i--;
       }
       else{
           i++;
       }
   }
   return nums;
    }
}
//LEETCODE //1968
