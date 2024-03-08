class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int maxi=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}
//LEETCODE
