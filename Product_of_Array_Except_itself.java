class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[]=new int[nums.length];
        int pre=1,post=1;
        for(int i=0;i<nums.length;i++){
answer[i]=pre;
pre*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            answer[i]*=post;
            post*=nums[i];
        }
        return answer;
    }
}

//LEETCODE MEDIUM LEVEL
