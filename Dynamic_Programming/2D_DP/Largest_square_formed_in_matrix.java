class Solution{
    static int maxi=0;
    public static int solve(int[][] mat,int i,int j){
        if(i>=mat.length || j>=mat[0].length){
            return 0;
        }
        int right=solve(mat,i,j+1);
        int diagnal=solve(mat,i+1,j+1);
        int down=solve(mat,i+1,j);
        if(mat[i][j]==1){
           int  ans=1+Math.min(right,Math.min(diagnal,down));
            maxi=Math.max(maxi,ans);
            return ans;
        }
        else{
            return 0;
        }
    }
    
     public static int solvemem(int[][] mat,int i,int j,int dp[][]){
        if(i>=mat.length || j>=mat[0].length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solvemem(mat,i,j+1,dp);
        int diagnal=solvemem(mat,i+1,j+1,dp);
        int down=solvemem(mat,i+1,j,dp);
        if(mat[i][j]==1){
           dp[i][j] =1+Math.min(right,Math.min(diagnal,down));
            maxi=Math.max(maxi,dp[i][j]);
            return dp[i][j];
        }
        else{
            return 0;
        }
    }
    static int maxSquare(int n, int m, int mat[][]){
        maxi=0;
        //  solve(mat,0,0);
        int dp[][]=new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        solvemem(mat,0,0,dp);
         return maxi;
    }
}

//GFG
