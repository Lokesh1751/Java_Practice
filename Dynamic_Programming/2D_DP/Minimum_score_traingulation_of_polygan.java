class Solution {
    public static int solve(int[] values,int i,int j ){
        if(i+1==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            ans=Math.min(ans,(values[i]*values[j]*values[k] +solve(values,i,k)+solve(values,k,j)));
        }
        return ans;
    }

     public static int solvemem(int[] values,int i,int j,int dp[][] ){
        if(i+1==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
           ans=Math.min(ans,(values[i]*values[j]*values[k] +solvemem(values,i,k,dp)+solvemem(values,k,j,dp)));
        }
        dp[i][j]=ans;
        return dp[i][j];
    }
     public static int solvetab(int[] values ){
        int n=values.length;
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,0);
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i+2;j<n;j++){
                 int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
           ans=Math.min(ans,(values[i]*values[j]*values[k] +dp[i][k]+dp[k][j]));
        }
        dp[i][j]=ans;
            }
        }
        return dp[0][n-1];
    }
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        // return solve(values,0,n-1);
        // return solvemem(values,0,n-1,dp);
        return solvetab(values);
    }
}
