import java.util.*;
public class Solution {
    
    public static int solve(int n,int x,int y,int z){
        if(n<0){
            return Integer.MIN_VALUE;
        }
        if(n==0){
           return 0;
        }
        int ans1=solve(n-x,x,y,z)+1;
        int ans2=solve(n-y,x,y,z)+1;
        int ans3=solve(n-z,x,y,z)+1;
        return Math.max(ans1,Math.max(ans2, ans3));
    }
    public static int solvemem(int n,int x,int y,int z,int dp[]){
        if(n<0){
            return Integer.MIN_VALUE;
        }
        if(n==0){
           return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans1=solvemem(n-x,x,y,z,dp)+1;
        int ans2=solvemem(n-y,x,y,z,dp)+1;
        int ans3=solvemem(n-z,x,y,z,dp)+1;
        dp[n]= Math.max(ans1,Math.max(ans2, ans3));
        return dp[n];
    }

     public static int solvetab(int n,int x,int y,int z){
         int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;

        for(int i=1;i<=n;i++){
            if(i-x>=0){
                dp[i]=Math.max(dp[i],dp[i-x]+1);
            }
            if(i-y>=0){
                dp[i]=Math.max(dp[i],dp[i-y]+1);
            }
            if(i-z>=0){
                dp[i]=Math.max(dp[i],dp[i-z]+1);
            }
        }
        if(dp[n]<0)
        return 0;
        return dp[n];
    }
    public static int cutSegments(int n, int x, int y, int z) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solvemem(n,x,y,z,dp);
        if(ans<0){
            return 0;
        }
        return ans;
    }
}

//CODESTUDIO
