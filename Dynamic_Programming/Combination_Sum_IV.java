class Solution {
    public static int helper(int[] nums,int t){
        if(t==0){
            return 1;
        }
        if(t<0){
            return 0;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=helper(nums,t-nums[i]);
        }

return sum;
    }
//rec + memoization
     public static int helpermemo(int[] nums,int t,int dp[]){
        if(t==0){
            return 1;
        }
        if(t<0){
            return 0;
        }
        if(dp[t]!=-1){
            return dp[t];
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=helpermemo(nums,t-nums[i],dp);
        }
dp[t]=sum;
return dp[t];
    }

  // tabulation
     public static int helpertab(int[] nums,int t){
         int dp[]=new int[t+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int j=1;j<=t;j++){
            for(int i=0;i<nums.length;i++){
if(j-nums[i]>=0){
    dp[j]+=dp[j-nums[i]];
}
            }
        }
        return dp[t];
    }
    public int combinationSum4(int[] nums, int target) {
        // return helper(nums,target);

        // int dp[]=new int[target+1];
        // Arrays.fill(dp,-1);
        // return helpermemo(nums,target,dp);

        return helpertab(nums,target);
    }
}
//Space Optimization is not possible in this question
//LEETCODE
