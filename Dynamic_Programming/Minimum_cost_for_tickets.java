class Solution {
    public int solve(int n,int[] days,int[] cost,int idx){
        if(idx>=n){
            return 0;
        }

        //1 day pass
        int option1=cost[0]+solve(n,days,cost,idx+1);

        //7 day pass
        int i=0;
        for(i=idx;i<n && days[i]<days[idx]+7;i++);
        int option2=cost[1]+solve(n,days,cost,i);

        //30 day pass
        int j=0;
         for(j=idx;j<n && days[j]<days[idx]+30;j++);

         int option3=cost[2]+solve(n,days,cost,j);

         return Math.min(option1,Math.min(option2,option3));

    }

       public int solvememo(int n,int[] days,int[] cost,int idx,int dp[]){
        if(idx>=n){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }

        //1 day pass
        int option1=cost[0]+solvememo(n,days,cost,idx+1,dp);

        //7 day pass
        int i=0;
        for(i=idx;i<n && days[i]<days[idx]+7;i++);
        int option2=cost[1]+solvememo(n,days,cost,i,dp);

        //30 day pass
        int j=0;
         for(j=idx;j<n && days[j]<days[idx]+30;j++);

         int option3=cost[2]+solvememo(n,days,cost,j,dp);

         dp[idx]= Math.min(option1,Math.min(option2,option3));
         return dp[idx];

    }

     public int solvetab(int n,int[] days,int[] cost){
    int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n]=0;
        for(int k=n-1;k>=0;k--){
             //1 day pass
        int option1=cost[0]+dp[k+1];

        //7 day pass
        int i=0;
        for(i=k;i<n && days[i]<days[k]+7;i++);
        int option2=cost[1]+dp[i];

        //30 day pass
        int j=0;
         for(j=k;j<n && days[j]<days[k]+30;j++);

         int option3=cost[2]+dp[j];

         dp[k]= Math.min(option1,Math.min(option2,option3));
        }
return dp[0];
    }
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[days.length+1];
        Arrays.fill(dp,-1);
        // return solve(days.length,days,costs,0);
        // return solvememo(days.length,days,costs,0,dp);
         return solvetab(days.length,days,costs);
    }
}


//SOL USING QUEUE IN O(N) TIME AND O(1) SPACE COZ MONTH QUEUE HAS 30 DAYS WHICH IS FIX AND WEEK QUEUE HAS 7 DAYS WHICH IS ALSO FIX SO THE SPACE COMPL. WILL BE O(1) MEANS CONSTANT
//LEETCODE
