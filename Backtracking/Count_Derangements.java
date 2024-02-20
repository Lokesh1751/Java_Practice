import java.util.*;
public class Solution {
	public static long helper(int n){
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		return (n-1)*(helper(n-1)+helper(n-2));
	}

	public static long helpermemo(int n,long dp[]){
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		if(dp[n]!=-1){
			return dp[n];
		}
		dp[n]= (n-1)%1000000007*(helpermemo(n-1,dp)%1000000007+helpermemo(n-2,dp)%1000000007);
		return dp[n];
	}

	public static long helpertab(int n){
		long dp[]=new long[n+1];
		Arrays.fill(dp,0);
		dp[1]=0;
dp[2]=1;
for(int i=3;i<=n;i++){
	long first=dp[i-1]%1000000007;
	long second=dp[i-2]%1000000007;
	long sum=(first+second)%1000000007;
	long ans=((i-1)*sum)%1000000007;
	dp[i]=ans;
}
return dp[n];
	}

	public static long spaceopt(int n){
long prev2=0;
long prev1=1;
for(int i=3;i<=n;i++){
	long first=prev1%1000000007;
	long second=prev2%1000000007;
	long sum=(first+second)%1000000007;
	long ans=((i-1)*sum)%1000000007;
	prev2=prev1;
	prev1=ans;
}
return prev1;
	}
	public static long countDerangements(int n) {
		// return helper(n);
		// long dp[]=new long[n+1];
		// Arrays.fill(dp,-1);
		// return helpermemo(n,dp)%1000000007;

		// return helpertab(n);

		return spaceopt(n);
	}
}
//CODESTUDIO
