class Solution {
    public  boolean helper(int[] nums,int k,int targetsum,int currsum,boolean[] visited,
    int idx){
if(k==0){
    return true;
}
if(currsum>targetsum){
    return false;
}
if(currsum==targetsum){
   return helper(nums,k-1,targetsum,0,visited,0);
}
for(int i=idx;i<nums.length;i++){
    if(!visited[i]){
        visited[i]=true;
    
    if(helper(nums,k,targetsum,currsum+nums[i],visited,i+1)){
        return true;
    }
    visited[i]=false;
    }
    
}
return false;
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxsum=Math.max(maxsum,nums[i]);
        }
        if(sum%k!=0  || maxsum>sum/k){
            return false;
        }
        return helper(nums,k,sum/k,0,new boolean[nums.length],0);
    }
}
//LEETCODE
