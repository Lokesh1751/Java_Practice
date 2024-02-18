class Solution {

  // BY RECURSION ONLY AND GIVES TLE
    public  int solve(int cost[],int n){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        return cost[n]+Math.min(solve(cost,n-1),solve(cost,n-2));
    }

  // BY RECURSION ANS MEMOIZATION
     public  int solvememo(int cost[],int n,int dp[]){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= cost[n]+Math.min(solvememo(cost,n-1,dp),solvememo(cost,n-2,dp));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // int ans=Math.min(solve(cost,n-1),solve(cost,n-2));
        // return ans;
        int ans=Math.min(solvememo(cost,n-1,dp),solvememo(cost,n-2,dp));
        return ans;
    }
}

//LEETCODE
