class Solution {
      public static int helper(int arr[],int i, int prev){
        if(i==arr.length){
            return 0;
        }
    //include case
    int inc=0;
    if(prev==-1 || arr[i]>arr[prev]){
        inc=1+helper(arr,i+1,i);
    }
       
       int exc=helper(arr,i+1,prev);
       return Math.max(inc,exc);
    }
    
     public static int helpermemo(int arr[],int i, int prev,int dp[][]){
        if(i==arr.length){
            return 0;
        }
        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
    //include case
    int inc=0;
    if(prev==-1 || arr[i]>arr[prev]){
        inc=1+helpermemo(arr,i+1,i,dp);
    }
       
       int exc=helpermemo(arr,i+1,prev,dp);
       dp[i][prev+1]= Math.max(inc,exc);
       return dp[i][prev+1];
    }

public static int helpertab(int arr[]){
                int size=arr.length;
        int dp[][]=new int[size+1][size+1];
      for(int row[]:dp){
          Arrays.fill(row,0);
      }
      for(int curr=size-1;curr>=0;curr--){
          for(int prev=curr-1;prev>=-1;prev--){

 int inc=0;
    if(prev==-1 || arr[curr]>arr[prev]){
        inc=1+dp[curr+1][curr+1];
    }
       
       int exc=dp[curr+1][prev+1];
       dp[curr][prev+1]= Math.max(inc,exc);

          }
      }
      return dp[0][0];
    }
public static int helperSO(int arr[]){
                int size=arr.length;
      int currr[]=new int[size+1];
      int next[]=new int[size+1];
      for(int curr=size-1;curr>=0;curr--){
          for(int prev=curr-1;prev>=-1;prev--){

 int inc=0;
    if(prev==-1 || arr[curr]>arr[prev]){
        inc=1+next[curr+1];
    }
       
       int exc=next[prev+1];
       currr[prev+1]= Math.max(inc,exc);

          }
          next=Arrays.copyOf(currr,currr.length);
      }
      return next[0];
    }
    public int lengthOfLIS(int[] nums) {
        int size=nums.length;
        int dp[][]=new int[size][size+1];
      for(int row[]:dp){
          Arrays.fill(row,-1);
      }
        //  return helper(nums,0,-1);
        //  return helpermemo(nums,0,-1,dp);
        return helpertab(nums);
    }
}
//LEETCODE
