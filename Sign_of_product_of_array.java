class Solution {
    public int arraySign(int[] nums) {
        int neg=0;
        for(Integer i:nums){
            if(i==0){
                return 0;
            }
            if(i<0){
                neg++;
            }
        }
        if(neg%2==0) return 1;

        return -1;
    }
}
//LEETCODE
