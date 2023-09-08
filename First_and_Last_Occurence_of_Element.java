class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> a=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a.add(i);
            }
        }
        ArrayList<Integer> an=new ArrayList<>();
        if(a.size()==1){
            a.add(a.get(0));
        }
        if(a.size()==0){
            a.add(-1);
            a.add(-1);
        }
          an.add(a.get(0));
        an.add(a.get(a.size()-1));
        int arr[]=new int[2];
        arr[0]=an.get(0);
        arr[1]=an.get(1);
        return arr;
    }
}
//LEETCODE
