class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long conse=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                conse++;
                count+=conse;
            }
           else{
            conse=0;
           }
        }
        return count;
    }
}
//LEETCODE
