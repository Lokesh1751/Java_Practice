class Solution {
    public int helper(int n,int k){
        if(n<=1) return n;
        if(k==1)return n;
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
          int break1=helper(i-1,k-1);
          int notbreak=helper(n-i,k);
          mini=Math.min(mini,Math.max(break1,notbreak)+1);
        }
        return mini;
    }

     public int helpermemo(int n,int k,int dp[][]){
        if(n<=1) return n;
        if(k==1)return n;
        if(dp[n][k]!=-1){
            return dp[n][k];
        }
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
          int break1=helpermemo(i-1,k-1,dp);
          int notbreak=helpermemo(n-i,k,dp);
          mini=Math.min(mini,Math.max(break1,notbreak)+1);
        }
        return dp[n][k]=mini;
    }
    public int twoEggDrop(int n) {
        int dp[][]=new int[n+1][3];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helpermemo(n,2,dp);
    }
}
//LEETCODE
