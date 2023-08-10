
class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int ans=-1;
        for(int i=1;i<n;i++){
           if(arr[i]<=x){
               ans=i;
           }
        }
        return ans;
    }
    
}

//GFG
//Floor in a sorted array
