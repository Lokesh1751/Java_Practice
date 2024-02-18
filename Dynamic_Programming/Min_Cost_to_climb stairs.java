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

  //BY TABULATION
  public int solvetab(int[] cost,int n){
int dp[]=new int[n+1];
Arrays.fill(dp,-1);
dp[0]=cost[0];
dp[1]=cost[1];
for(int i=2;i<n;i++){
    dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
}
return Math.min(dp[n-1],dp[n-2]);
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
