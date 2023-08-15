class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++){
            hs.add(sum);
            sum+=arr[i];
            if(hs.contains(sum)){
                return true;
            }
        }
        return false;
    }
    
}

//GFG
//SUBARRAY WITH ZERO SUM
