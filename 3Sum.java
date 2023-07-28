class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedHashSet<List<Integer>> l=new LinkedHashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++){
           int j=i+1;
           int k=nums.length-1;
           while(j<k){
               int sum=nums[j]+nums[k];
               if(sum==(-nums[i])){
                   l.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
               }
               else if(sum>(-nums[i])){
                   k--;
               }
               else
               {
                   j++;
               }
           }
       }
       for(List<Integer> i:l){
           ans.add(i);
       }
       return ans;
    }
}
//COMPLEXITY O(N2)
//LEETCODE
