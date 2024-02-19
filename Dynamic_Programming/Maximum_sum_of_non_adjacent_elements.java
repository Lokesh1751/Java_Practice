import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int solve(ArrayList<Integer> nums,int i){
		if(i>=nums.size()){
			return 0;
		}
	     int inc=solve(nums,i+2)+nums.get(i);
		 int exc=solve(nums,i+1)+0;
		 return Math.max(inc,exc);
	}

	public static int solvememo(ArrayList<Integer> nums,int i,int dp[]){
		if(i>=nums.size()){
			return 0;
		}
		if(dp[i]!=-1){
			return dp[i];
		}
	     int inc=solve(nums,i+2,dp)+nums.get(i);
		 int exc=solve(nums,i+1,dp)+0;
		 dp[i]= Math.max(inc,exc);
		 return dp[i];
	}

	public static int solvetab(ArrayList<Integer> nums){
		int dp[]=new int[nums.size()];
		Arrays.fill(dp,-1);
		dp[0]=nums.get(0);
		for(int i=1;i<nums.size();i++){
			 int inc = (i - 2 >= 0 ? dp[i - 2] : 0) + nums.get(i);
			int exc=dp[i-1]+0;
			dp[i]=Math.max(inc, exc);
		}
		return dp[nums.size()-1];
	}
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int dp[]=new int[nums.size()+1];
		Arrays.fill(dp,-1);
		int ans=solve(nums,0,dp);
		return ans;
	}
}
//CODESTUDIO
