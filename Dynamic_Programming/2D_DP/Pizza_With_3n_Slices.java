class Solution {
    public int solve(int i,int s[],int e,int n){
        if(n==0 || i>=e){
            return 0;
        }

        // take slice
        int take=s[i]+solve(i+2,s,e,n-1);
        int nottake=0+solve(i+1,s,e,n);
        return Math.max(take,nottake);
    }

      public int solvememo(int i,int s[],int e,int n,int dp[][]){
        if(n==0 || i>=e){
            return 0;
        }
if(dp[i][n]!=-1){
    return dp[i][n];
}
        // take slice
        int take=s[i]+solvememo(i+2,s,e,n-1,dp);
        int nottake=0+solvememo(i+1,s,e,n,dp);
        dp[i][n]= Math.max(take,nottake);
        return dp[i][n];
    }

    public int solvetab(int s[]){
        int k=s.length;
         int dp1[][]=new int[k+2][k+2];
        for(int []row:dp1){
            Arrays.fill(row,0);
        }

         int dp2[][]=new int[k+2][k+2];
        for(int []row:dp2){
            Arrays.fill(row,0);
        }

        for(int i=k-2;i>=0;i--){
            for(int n=1;n<=k/3;n++){
                 // take slice
        int take=s[i]+dp1[i+2][n-1];
        int nottake=0+dp1[i+1][n];
        dp1[i][n]= Math.max(take,nottake);
            }
        }

         for(int i=k-1;i>=1;i--){
            for(int n=1;n<=k/3;n++){
                 // take slice
        int take=s[i]+dp2[i+2][n-1];
        int nottake=0+dp2[i+1][n];
        dp2[i][n]= Math.max(take,nottake);
            }
        }
        return Math.max(dp1[0][k/3],dp2[1][k/3]);
    }

     public int solveSO(int s[]){
        int k=s.length;
        int prev1[]=new int[k+2];
        int curr1[]=new int[k+2];
        int next1[]=new int[k+2];

          int prev2[]=new int[k+2];
        int curr2[]=new int[k+2];
        int next2[]=new int[k+2];

        for(int i=k-2;i>=0;i--){
            for(int n=1;n<=k/3;n++){
                 // take slice
        int take=s[i]+next1[n-1];
        int nottake=0+curr1[n];
       prev1[n]= Math.max(take,nottake);
            }
            next1=Arrays.copyOf(curr1,curr1.length);
            curr1=Arrays.copyOf(prev1,prev1.length);
        }

         for(int i=k-1;i>=1;i--){
            for(int n=1;n<=k/3;n++){
                 // take slice
        int take=s[i]+next2[n-1];
        int nottake=0+curr2[n];
       prev2[n]= Math.max(take,nottake);
            }
            next2=Arrays.copyOf(curr2,curr2.length);
            curr2=Arrays.copyOf(prev2,prev2.length);
        }
        return Math.max(curr1[k/3],curr2[k/3]);
    }
    public int maxSizeSlices(int[] slices) {
        int k=slices.length;
        int n=(k/3)+1;
        int dp1[][]=new int[k+1][k+1];
        for(int []row:dp1){
            Arrays.fill(row,-1);
        }
  int dp2[][]=new int[k+1][k+1];
        for(int []row:dp2){
            Arrays.fill(row,-1);
        }
        
        // int first= solve(0,slices,k-1,k/3);
        // int second=solve(1,slices,k,k/3);
        // return Math.max(first,second);

        // int first= solvememo(0,slices,k-1,k/3,dp1);
        // int second=solvememo(1,slices,k,k/3,dp2);
        // return Math.max(first,second);

        // return solvetab(slices);

          return solveSO(slices);
    }
}
//LEETCODE
