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

     public int helpertab(int n){
          int dp[]=new int[n+1];
        Arrays.fill(dp,0);
       dp[0]=1;
       dp[1]=1;
       for(int i=2;i<=n;i++){
           for(int j=1;j<=i;j++){
               dp[i]+=dp[j-1]*dp[i-j];
           }
       }
       return dp[n];
    }
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // return helper(n);
        // return helpermemo(n,dp);
        return helpertab(n);
    }
}
//LEETCODE
