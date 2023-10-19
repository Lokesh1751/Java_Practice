class Solution {
    public String largestNumber(int[] h) {
        String nums[]=new String[h.length];
        boolean sl=true;
        for(int i=0;i<h.length;i++){
            if(h[i]!=0){
sl=false;
break;
            }
        }
        if(sl){
            return "0";
        }
        for(int i=0;i<h.length;i++){
            nums[i]=Integer.toString(h[i]);
        }
        Arrays.sort(nums, (a,b) -> (b+a).compareTo(a+b));
        String ans="";
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        return ans;
    }
}
//LEETCODE
