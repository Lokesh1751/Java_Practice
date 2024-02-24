class Solution {
    public int solve(int[] ob,int lane,int pos){
        if(pos==ob.length-1){
            return 0;
        }
        if(ob[pos+1]!=lane){
            return solve(ob,lane,pos+1);
        }
        else{
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<=3;i++){
                if(lane!=i && ob[pos]!=i){
ans=Math.min(ans,1+solve(ob,i,pos));
                }
            }
            return ans;
        }
    }

     public int solvememo(int[] ob,int lane,int pos,int dp[][]){
        if(pos==ob.length-1){
            return 0;
        }
        if(dp[lane][pos]!=-1){
            return dp[lane][pos];
        }
        if(ob[pos+1]!=lane){
            return solvememo(ob,lane,pos+1,dp);
        }
        else{
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<=3;i++){
                if(lane!=i && ob[pos]!=i){
ans=Math.min(ans,1+solvememo(ob,i,pos,dp));
                }
            }
            dp[lane][pos]=ans;
            return dp[lane][pos];
        }
    }

     public int solvetab(int[] ob){
         int n=ob.length-1;
       int dp[][]=new int[4][n+1];
        for(int []row:dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dp[0][n]=0;
        dp[1][n]=0;
        dp[2][n]=0;
        dp[3][n]=0;

        for(int pos=n-1;pos>=0;pos--){
            for(int lane=1;lane<=3;lane++){
            if(ob[pos+1]!=lane){
            dp[lane][pos]=dp[lane][pos+1];
        }
        else{
            int ans=Integer.MAX_VALUE;
            for(int i=1;i<=3;i++){
                if(lane!=i && ob[pos]!=i){
ans=Math.min(ans,1+dp[i][pos+1]);
                }
            }
            dp[lane][pos]=ans;
        }
            }
        }
        return Math.min(dp[2][0],Math.min(1+dp[1][0],1+dp[3][0]));
    }
    public int minSideJumps(int[] obstacles) {
        int dp[][]=new int[4][obstacles.length+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        // return solve(obstacles,2,0);
        // return solvememo(obstacles,2,0,dp);
        return solvetab(obstacles);
    }
}
//LEETCODE
