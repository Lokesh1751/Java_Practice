class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hm.add(nums[i]);
        }
        if(hm.size()!=nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}
//LEETCODE
