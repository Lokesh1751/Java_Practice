class Solution {
    public int maxProduct(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            int mul=nums[i];
            maxi=Math.max(maxi,mul);
            for(int j=i+1;j<nums.length;j++){
mul=mul*nums[j];
maxi=Math.max(maxi,mul);

            }
        }
        return maxi;
    }
}
//LEETCODE
