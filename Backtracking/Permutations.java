class Solution {
    public static void solve(int nums[],int idx,List<List<Integer>> ans){
        if(idx>=nums.length){
            List<Integer> a=new ArrayList<>();
            for(Integer i:nums){
                a.add(i);
            }
            ans.add(a);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
            solve(nums,idx+1,ans);
              temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        int idx=0;
        solve(nums,idx,ans);
        return ans;
    }
}
//LEETCODE
