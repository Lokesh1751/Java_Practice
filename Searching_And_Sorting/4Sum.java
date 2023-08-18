class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
          Arrays.sort(nums);
        List<List<Integer>> u=new ArrayList<>();
        Set<List<Integer>> ans=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                int start=j+1;
                int end=nums.length-1;
                while(start<end){
                    long su=nums[i];
                    su+=nums[j];
                    su+=nums[start];
                    su+=nums[end];
                    if(su==target){
                       ans.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;
                        end--;
                    }
                    else if(su<target){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }


      for(List<Integer> t:ans){
          u.add(t);
      }
      
        return u;
    }
}
