import java.util.* ;
import java.io.*; 
public class Solution {
    public static int helper(int t,int nums[]){
        if(t==0){
            return 0;
        }
        if(t<0){
            return Integer.MAX_VALUE;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ans=helper(t-nums[i],nums);
            if(ans!=Integer.MAX_VALUE){
                mini=Math.min(mini,ans+1);
            }
        }
        return mini;
    }
    public static int minimumElements(int num[], int x) {
        int ans=helper(x,num);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }

}
//CODESTUDIO
