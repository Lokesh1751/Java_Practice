class Solution {
     public static int helper(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
    public int fib(int n) {
         int dparray[]=new int[n+1];
       Arrays.fill(dparray,-1);
       return helper(n,dparray);
    }
}
//leetcode
