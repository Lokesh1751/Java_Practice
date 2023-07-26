class Solution {
  //O(N+LOGN) COMPLEXITY
    int getPairsCount(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        int cnt=0;
        while(i<=j){
            int sum=arr[i]+arr[j];
            if(sum>k){
                j--;
            }
            else if(sum<k){
                i++;
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
}
