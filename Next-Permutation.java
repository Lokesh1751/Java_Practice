class Solution {
    public void nextPermutation(int[] nums) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int idx1=-1;
        int idx2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        if(idx1<0){
            Arrays.sort(nums);
        }
        else{
            int k=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[idx1]){
                idx2=i;
                break;
            }
        }
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
        for(int i=idx1+1;i<k;i++){
            al.add(nums[i]);
        }
        Collections.reverse(al);
        int j=0;
        for(int i=idx1+1;i<k;i++){
            nums[i]=al.get(j++);
        }
        }

    }
}

//LEETCODE
