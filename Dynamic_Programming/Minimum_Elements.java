import java.util.* ;
import java.io.*; 
public class Solution {

    //Simple Recurson TLE
    public static int helper(int t,int nums[]){
        if(t==0){
            return 0;
        }
        if(t<0){
            return Integer.MAX_VALUE;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ans=helper(t-nums[i],nums);
            if(ans!=Integer.MAX_VALUE){
                mini=Math.min(mini,ans+1);
            }
        }
        return mini;
    }

    //WITH RECURSION AND MEMO TLE
    public static int helpermemo(int t,int nums[],int dp[]){
         if(t==0){
            return 0;
        }
        if(t<0){
            return Integer.MAX_VALUE;
        }
        if(dp[t]!=-1){
            return dp[t];
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ans=helper(t-nums[i],nums);
            if(ans!=Integer.MAX_VALUE){
                mini=Math.min(mini,ans+1);
            }
        }
        dp[t]=mini;
        return mini;
    }

    //WITH TABULAR METHOD ACCEPTED
    public static int solvetab(int num[],int x){
        int dp[]=new int[x+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=x;i++){
            for(int j=0;j<num.length;j++){
                if(i-num[j]>=0 && dp[i-num[j]]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],1+dp[i-num[j]]);
                }
            }
        }
        if(dp[x]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[x];
    }
    public static int minimumElements(int num[], int x) {
        // int ans=helper(x,num);
        // if(ans==Integer.MAX_VALUE){
        //     return -1;
        // }
        // return ans;
        //  int memo[]=new int[x+1];
        //  Arrays.fill(memo,-1);
        //  int ans =helpermemo(x, num, memo);
        //  if(ans==Integer.MAX_VALUE){
        //      return -1;
        //  }
         return solvetab(num,x);
    }

}
//CODESTUDIO
