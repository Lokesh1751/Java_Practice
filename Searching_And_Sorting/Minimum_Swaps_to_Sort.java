class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
       ArrayList<Integer> a=new ArrayList<Integer>();
       for(int i=0;i<nums.length;i++){
           a.add(nums[i]);
       }
       Collections.sort(a);
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<a.size();i++){
           hm.put(a.get(i),i);
       }
       int cnt=0;
       int i=0;
       while(i<nums.length){
          int val = nums[i];
             if(hm.get(val)==i)
             {
                 i++;
             }else{
                 int stridx = hm.get(val);
                 int temp = nums[i];
                 
                 nums[i] = nums[stridx];
                 nums[stridx] = temp;
                 cnt++;
                 
             }
       }
         return cnt;
    }
  
}

//GFG
