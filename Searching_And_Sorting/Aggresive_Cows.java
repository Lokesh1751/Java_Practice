import java.util.*;
public class Solution {
    public static boolean isPossible(int arr[],int k,int mid){
        int cowcnt=1;
        int lastpos=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-lastpos>=mid){
                cowcnt++;
                lastpos=arr[i];
                if(cowcnt==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
    //initially start =0;
    Arrays.sort(stalls);
    int s=0;

    //and end is maximum element from array
    int maxi=-1;
    for(int i=0;i<stalls.length;i++){
        maxi=Math.max(maxi,stalls[i]);
    }
    int e=maxi;
    int ans=-1;
    int mid=s+(e-s)/2;
    while(s<=e){
        if(isPossible(stalls,k,mid)){
            ans=mid;
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        mid=s+(e-s)/2;
    }
    return ans;

    }
}

//CodeStudio
//Binary Search Problem
