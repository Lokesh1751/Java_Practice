class Solution {
    public static int helper(int[] coins,int a){
        if(a==0){
            return 0;
        }
        if(a<0){
            return Integer.MAX_VALUE;
        }
         int mini=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
           int ans=helper(coins,a-coins[i]);
if(ans!=Integer.MAX_VALUE){
    mini=Math.min(mini,1+ans);
}
        }
     return mini;
    }

    public static int helpermemo(int[] coins,int a,int[] dp){
        if(a==0){
            return 0;
        }
        if(a<0){
            return Integer.MAX_VALUE;
        }
        if(dp[a]!=-1){
            return dp[a];
        }
         int mini=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
           int ans=helpermemo(coins,a-coins[i],dp);
if(ans!=Integer.MAX_VALUE){
    mini=Math.min(mini,1+ans);
}
        }
        dp[a]=mini;
     return dp[a];
    }
    public int coinChange(int[] coins, int amount) {
    //    int ans = helper(coins, amount);
    //     return (ans == Integer.MAX_VALUE) ?  -1 : ans;
    int dp[]=new int[amount+1];
    Arrays.fill(dp,-1);

    int ans= helpermemo(coins,amount,dp);
    return (ans == Integer.MAX_VALUE) ?  -1 : ans;
    }
}

//LEETCODE
