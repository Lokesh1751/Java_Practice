class Solution {
    String printLargest(String[] nums) {
        Arrays.sort(nums, (a,b) -> (b+a).compareTo(a+b));
        String ans="";
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        return ans;
    }
}
//GFG
