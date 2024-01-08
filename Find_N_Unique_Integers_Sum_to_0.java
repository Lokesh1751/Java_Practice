class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int j=0;
        if(n%2==0){
            for(int i=1;i<=n/2;i++){
            arr[j++]=i;
        }
        int k=-(n/2);
        for(int i=(k);i<0;i++){
            arr[j++]=i;
        }
        }
        else{
            for(int i=0;i<=n/2;i++){
            arr[j++]=i;
        }
        int k=-(n/2);
        for(int i=(k);i<0;i++){
            arr[j++]=i;
        }
        }
        return arr;
    }
}
//LEETCODE
