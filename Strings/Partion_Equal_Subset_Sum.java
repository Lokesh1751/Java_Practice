class Solution{
    
     public static  boolean helper(int[] nums,int k,int targetsum,int currsum,boolean[] visited,
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
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        int k=2;
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxsum=Math.max(maxsum,arr[i]);
        }
        if(sum%k!=0  || maxsum>sum/k){
            return 0;
        }
        if(helper(arr,k,sum/k,0,new boolean[arr.length],0)){
            return 1;
        }
        return 0;
    }
}
//gfg
