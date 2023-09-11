class Solution {

    public int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int[nums.length];
         ArrayList<Integer> ev=new ArrayList<>();
     ArrayList<Integer> od=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
         if(nums[i]%2==0){
             ev.add(nums[i]);
         }
         else{
             od.add(nums[i]);
         }
     }
     int k=0;
     int j=0;
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
                ans[i]=ev.get(k++);
            }
            else{
                ans[i]=od.get(j++);
            }
        }
        return ans;
    }
}
//LEETCODE
