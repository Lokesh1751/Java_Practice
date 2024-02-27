class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int ans=0;
        Map<Integer,Integer> dp[]=new HashMap[n+1];
        for(int i=0;i<n;i++){
            dp[i]=new HashMap<>();
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int diff=nums[i]-nums[j];
                int cnt=1;
                if(dp[j].containsKey(diff)){
                    cnt=dp[j].get(diff);
                }
                dp[i].put(diff,1+cnt);
                ans=Math.max(ans,dp[i].get(diff));
            }
        }
        return ans;
    }
}

//USING RECURSION + MEMOISATION
class Solution {
    public int solve(int i,int d,int nums[]){
        if(i<0){
            return 0;
        }
        int ans=0;
        for(int j=i-1;j>=0;j--){
            if(nums[i]-nums[j]==d){
                ans=Math.max(ans,1+solve(j,d,nums));
            }
        }
        return ans;
    }
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=Math.max(ans,2+solve(i,nums[j]-nums[i],nums));
            }
        }
        return ans;
    }
}

// USING RECURSION
class Solution {
    public int solve(int i,int d,int nums[]){
        if(i<0){
            return 0;
        }
        int ans=0;
        for(int j=i-1;j>=0;j--){
            if(nums[i]-nums[j]==d){
                ans=Math.max(ans,1+solve(j,d,nums));
            }
        }
        return ans;
    }
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=Math.max(ans,2+solve(i,nums[j]-nums[i],nums));
            }
        }
        return ans;
    }
}

//LEETCODE
