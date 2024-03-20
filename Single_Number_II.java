class Solution {
    public int singleNumber(int[] nums) {
          int i=0;
          int count=1;
          Arrays.sort(nums);
          while(i<nums.length-1){
if(nums[i]==nums[i+1]){
    count++;
}
else if(nums[i]!=nums[i+1] && count<3){
    return nums[i];
}
else{
    count=1;
}
i++;
          }
          return nums[nums.length-1];
    }
}
//LEETCODE
