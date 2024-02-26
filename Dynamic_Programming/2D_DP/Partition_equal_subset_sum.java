class Solution {
    public boolean solve(int nums[],int t,int i){
        if(i>=nums.length){
            return false;
        }

        if(t<0){
            return false;
        }
        if(t==0){
            return true;
        }
        boolean inc=solve(nums,t-nums[i],i+1);
        boolean exc=solve(nums,t,i+1);
        return inc || exc;
    }

      public boolean solvetab(int nums[],int s) {
          int n=nums.length;
               int dp[][] = new int[nums.length + 1][s + 1];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }
        for(int i=0;i<nums.length;i++){
            dp[i][0]=1;
        }

        for(int i=n-1;i>=0;i--){
            for(int t=1;t<=s;t++){
                int inc=0;
                if(t-nums[i]>=0)
                  inc=dp[i+1][t-nums[i]];
        int exc=dp[i+1][t];
        if(inc==1 || exc==1){
            dp[i][t]=1;
        }
        else{
            dp[i][t]=0;
        }
            }
        }
        int v= dp[0][s];
        if(v==1) return true;
        return false;
    }

   public boolean solvememo(int nums[],int s) {
          int n=nums.length;
               int dp[][] = new int[nums.length + 1][s + 1];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }
        for(int i=0;i<nums.length;i++){
            dp[i][0]=1;
        }

        for(int i=n-1;i>=0;i--){
            for(int t=1;t<=s;t++){
                int inc=0;
                if(t-nums[i]>=0)
                  inc=dp[i+1][t-nums[i]];
        int exc=dp[i+1][t];
        if(inc==1 || exc==1){
            dp[i][t]=1;
        }
        else{
            dp[i][t]=0;
        }
            }
        }
        int v= dp[0][s];
        if(v==1) return true;
        return false;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(Integer i:nums){
            sum+=i;
        }
        int s=sum/2;
        if(sum%2!=0){
            return false;
        }
                Boolean dp[][] = new Boolean[nums.length + 1][s + 1];
        for (Boolean[] row : dp) {
            Arrays.fill(row, null);
        }
        return solvetab(nums, s);

        // return solve(nums,s,0);

       // return solvetabulation(nums,s);
    }
}
//LEETCODE
