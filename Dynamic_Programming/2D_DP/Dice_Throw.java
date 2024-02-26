//User function Template for Java

class Solution {
    public static long solve(int n,int m,int x){
        if(x<0){
            return 0;
        }
        if(n==0 && x!=0){
            return 0;
        }
        if(x==0 && n!=0){
            return 0;
        }
        if(x==0 && n==0){
            return 1;
        }
        long ans=0;
        for(int i=1;i<=m;i++){
            ans=ans+solve(n-1,m,x-i);
        }
        return ans;
    }
    
     public static long solvememo(int n,int m,int x,long dp[][]){
        if(x<0){
            return 0;
        }
        if(n==0 && x!=0){
            return 0;
        }
        if(x==0 && n!=0){
            return 0;
        }
        if(x==0 && n==0){
            return 1;
        }
        if(dp[n][x]!=-1){
            return dp[n][x];
        }
        long ans=0;
        for(int i=1;i<=m;i++){
            ans=ans+solvememo(n-1,m,x-i,dp);
        }
        dp[n][x]= ans;
        return dp[n][x];
    }
    
    public static long solvetab(int n,int m,int x){
      long dp[][]=new long[n+1][x+1];
        for(long row[]:dp){
            Arrays.fill(row,0);
        }
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=x;j++){
              long ans=0;
        for(int k=1;k<=m;k++){
            if(j-k>=0)
            ans=ans+dp[i-1][j-k];
        }
        dp[i][j]=ans;
            }
        }
        return dp[n][x];
    }
    
    public static long solveSO(int n,int m,int x){
      long prev[]=new long[x+1];
      Arrays.fill(prev,0);
      long curr[]=new long[x+1];
      Arrays.fill(curr,0);
        prev[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=x;j++){
              long ans=0;
        for(int k=1;k<=m;k++){
            if(j-k>=0)
            ans=ans+prev[j-k];
        }
       curr[j]=ans;
            }
            prev=Arrays.copyOf(curr,curr.length);
        }
        return prev[x];
    }
    static long noOfWays(int M , int N , int X) {
        long dp[][]=new long[N+1][X+1];
        for(long row[]:dp){
            Arrays.fill(row,-1);
        }
        
        // return solve(N,M,X);
        // return solvememo(N,M,X,dp);
        // return solvetab(N,M,X);
        return solveSO(N,M,X);
    }
};
//GFG
