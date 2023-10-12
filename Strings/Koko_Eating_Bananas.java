class Solution {
    public static boolean caneat(int piles[],int h,int m){
        int ansh=0;
        for(int i:piles){
            ansh+=(i+m-1)/m;
        }
        return ansh<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=Integer.MAX_VALUE;
        while(s<=e){
            int m=s+(e-s)/2;
            if(!caneat(piles,h,m)){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return s;
    }
}
//leetcode
