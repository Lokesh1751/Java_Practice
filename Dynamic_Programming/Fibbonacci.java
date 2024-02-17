//Using tabulation method bottom up approach
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
         int dparray[]=new int[n+1];
      dparray[0]=0;
      dparray[1]=1;
      for(int i=2;i<=n;i++){
          dparray[i]=dparray[i-1]+dparray[i-2];
      }
      return dparray[n];
    }
}

//using recursion+memorization top down approach
class Solution {
     public static int helper(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
    public int fib(int n) {
         int dparray[]=new int[n+1];
       Arrays.fill(dparray,-1);
       return helper(n,dparray);
    }
}
//using space optimization
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
       int prev1=1;
       int prev2=0;
       for(int i=2;i<=n;i++){
           int curr=prev1+prev2;
           prev2=prev1;
           prev1=curr;
       }
       return prev1;
    }
}
//LEETCODE
