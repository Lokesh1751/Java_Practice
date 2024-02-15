class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int maj=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==maj){
                cnt+=1;
            }
            else{
                cnt-=1;
                if(cnt==0){
cnt=1;
maj=nums[i];
                }
            }
        }
        int count = 0;
        for (int num : nums) {
            if (num == maj) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return maj;
        } 
    
    return -1;
    }
}
//LEETCODE
