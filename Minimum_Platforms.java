//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int count=0;
        int maxi=Integer.MIN_VALUE;
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                maxi=Math.max(count,maxi);
                i++;
            }
           else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return maxi;
    }
    
}
//GFG
