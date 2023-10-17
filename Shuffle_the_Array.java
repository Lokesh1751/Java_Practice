class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int k=0;
        int i=0;
        while(n!=nums.length){
            ans[i++]=nums[k++];
            ans[i++]=nums[n++];
        }
return ans;
    }
}
//LEETCODE
