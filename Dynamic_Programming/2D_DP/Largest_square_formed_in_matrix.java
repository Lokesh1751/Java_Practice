
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
    public static int solvetab(int[][] mat){
         int row=mat.length;
        int col=mat[0].length;
         int dp[][]=new int[row+1][col+1];
        for(int r[]:dp){
            Arrays.fill(r,0);
        }
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                
                
        int right=dp[i][j+1];
        int diagnal=dp[i+1][j+1];
        int down=dp[i+1][j];
        if(mat[i][j]==1){
           dp[i][j] =1+Math.min(right,Math.min(diagnal,down));
            maxi=Math.max(maxi,dp[i][j]);
        }
        else{
            dp[i][j]= 0;
        }
                
            }
        }
        return -1;
    }
    
     public static int solveso(int[][] mat){
         int row=mat.length;
        int col=mat[0].length;
         int curr[]=new int[col+1];
         int next[]=new int[col+1];
         Arrays.fill(curr,0);
         Arrays.fill(next,0);
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                
                
        int right=curr[j+1];
        int diagnal=next[j+1];
        int down=next[j];
        if(mat[i][j]==1){
           curr[j] =1+Math.min(right,Math.min(diagnal,down));
            maxi=Math.max(maxi,curr[j]);
        }
        else{
            curr[j]= 0;
        }
                
            }
            next = Arrays.copyOf(curr, curr.length);
        }
        return 0;
    }
    static int maxSquare(int n, int m, int mat[][]){
        maxi=0;
        //  solve(mat,0,0);
        int dp[][]=new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        // solvemem(mat,0,0,dp);
        // solvetab(mat);
        //  return maxi;
        solveso(mat);
        return maxi;
    }
}

//GFG
