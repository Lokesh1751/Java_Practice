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


//APPROACH 2 AND OPTIMIZED APPROACH
//User function Template for Java
//TIME COMPLEXITY:O(N)

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
HashMap<Integer,Integer>  hm=new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                if(hm.containsKey(k-arr[i])){
                    cnt+=hm.get(k-arr[i]);
                }
                if(hm.get(arr[i])==null){
                    hm.put(arr[i],0);
                }

    hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        return cnt;
    }
}
