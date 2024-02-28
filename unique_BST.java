class Solution {
    public int helper(int n){
        if(n<=1){
            return 1;
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=helper(i-1)*helper(n-i);
        }
        return ans;
    }

     public int helpermemo(int n,int dp[]){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=helpermemo(i-1,dp)*helpermemo(n-i,dp);
        }
        return dp[n]= ans;
    }
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // return helper(n);
        return helpermemo(n,dp);
    }
}
//LEETCODE
