class Solution {
    public static long findcost(int mid,int nums[],int cost[]){
 long tc=0L;
for(int i=0;i<nums.length;i++){
   tc+=1L*Math.abs(nums[i]-mid)*cost[i];
}
return tc;
    }
    public long minCost(int[] nums, int[] cost) {
        long ans=-900;
        int right=Integer.MIN_VALUE;
        int left=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(left>nums[i]){
                left=nums[i];
            }
        }

         for(int i=0;i<nums.length;i++){
            if(right<nums[i]){
                right=nums[i];
            }
        }
        while(left<right){
            int mid=(left+right)/2;
          long cost1=  findcost(mid,nums,cost);
          long cost2= findcost(mid+1,nums,cost);

          ans=Math.min(cost1,cost2);

          if(cost1>cost2){
              left=mid+1;
          }
          else{
              right=mid;
          }
        }
        if(ans==-900){
            return 0;
        }
        else{
            return ans;
        }
    }
}

//LEETCODE
