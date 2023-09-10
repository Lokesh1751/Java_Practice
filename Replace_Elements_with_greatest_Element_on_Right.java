class Solution {
    public static int getgreat(int k,int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=k;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
if(i<arr.length-1){
                int ele=getgreat(i+1,arr);
            arr[i]=ele;
}
if(i==arr.length-1){
    arr[i]=-1;
}
        }
        return arr;
    }
}
//LEETCODE
