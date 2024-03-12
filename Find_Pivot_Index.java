//OPTIMISED 
class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        for(int n:nums){
            right+=n;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0){
                left+=nums[i-1];
            }
            right-=nums[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}

// BRUTE FORCE
class Solution {
    public int findnextsum(int idx,int nums[]){
        int sum=0;
        for(int i=idx+1;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           int next=findnextsum(i,nums);
           if(sum==next){
            return i;
           }
           sum=sum+nums[i];
        }
        return -1;
    }
}

//LEETCODE
