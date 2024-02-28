class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> dp= new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i]-difference;
            int tempans=0;
            if(dp.containsKey(temp)){
                tempans=dp.get(temp);
            }

            dp.put(arr[i],1+tempans);

            ans=Math.max(ans,dp.get(arr[i]));
        }
        return ans;
    }
}
//LEETCODE
