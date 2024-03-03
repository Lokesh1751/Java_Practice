class Solution {
    public int helper(int s,int e){
        if(s>=e){
            return 0;
        }
        int maxi=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            maxi=Math.min(maxi,i+Math.max(helper(s,i-1),helper(i+1,e)));
        }
        return maxi;
    }

     public int helpermemo(int s,int e,int dp[][]){
        if(s>=e){
            return 0;
        }
        if(dp[s][e]!=-1){
            return dp[s][e];
        }
        int maxi=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            maxi=Math.min(maxi,i+Math.max(helpermemo(s,i-1,dp),helpermemo(i+1,e,dp)));
        }
       dp[s][e]= maxi;
       return dp[s][e];
    }

     public int helpertab(int n){
          int dp[][]=new int[n+2][n+2];
        for(int row[]:dp){
            Arrays.fill(row,0);
        }

        for(int s=n;s>=1;s--){
            for(int e=s;e<=n;e++){
                if(s==e)
                continue;

                else{
                     int maxi=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++){
            maxi=Math.min(maxi,i+Math.max(dp[s][i-1],dp[i+1][e]));
        }
       dp[s][e]= maxi;
                }
            }
        }
        return dp[1][n];
    }
    public int getMoneyAmount(int n) {
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helpertab(n);
        // return helper(1,n);
    }
}
//LEETCODE
