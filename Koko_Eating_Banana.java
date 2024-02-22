class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(Integer i:piles){
            maxi=Math.max(maxi,i);
        }
        int s=1;
        int e=maxi;
        int ans=0;
        while(s<=e){
            int m=s+(e-s)/2;
            int time=0;
            for(int i=0;i<piles.length;i++){
                time+=Math.ceil((double)piles[i]/(double)m);
            }
            if(time<=h){
          ans=m;
          e=m-1;
            }
            else{
s=m+1;
            }
        }
        return ans;
    }

}
//LEETCODE
