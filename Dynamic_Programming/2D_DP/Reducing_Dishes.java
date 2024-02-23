class Solution {
    public int helper(int[] s,int i,int time){
        if(i==s.length){
            return 0;
        }
        int include=(time+1)*s[i]+helper(s,i+1,time+1);
        int exclude=0+helper(s,i+1,time);
        return Math.max(include,exclude);
    }

     public int helpermem(int[] s,int i,int time,int dp[][]){
        if(i==s.length){
            return 0;
        }
        if(dp[i][time]!=-1){
            return dp[i][time];
        }
        int include=(time+1)*s[i]+helpermem(s,i+1,time+1,dp);
        int exclude=0+helpermem(s,i+1,time,dp);
        dp[i][time]= Math.max(include,exclude);
        return dp[i][time];
    }

     public int helpertab(int[] s){
        int n=s.length;
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,0);
        }
        for(int i=n-1;i>=0;i--){
            for(int time=i;time>=0;time--){
                 int include=(time+1)*s[i]+dp[i+1][time+1];
        int exclude=0+dp[i+1][time];
        dp[i][time]= Math.max(include,exclude);
            }
        }
        return dp[0][0];
    }

    public int helperSO(int[] s){
         int n=s.length;
        int curr[]=new int[n+1];
        int next[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            for(int time=i;time>=0;time--){
                 int include=(time+1)*s[i]+next[time+1];
        int exclude=0+next[time];
        curr[time]= Math.max(include,exclude);
            }
            next=Arrays.copyOf(curr,curr.length);
        }
        return next[0];
    }
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n=satisfaction.length;
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        // return helper(satisfaction,0,0);
        // return helpermem(satisfaction,0,0,dp);
        // return helpertab(satisfaction);
        return helperSO(satisfaction);
    }
}
//LEETCODE
