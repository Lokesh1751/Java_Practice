class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int left=0;
        int right=1;
        while(left<=right && right<=size-1){
            int diff=arr[right]-arr[left];
            if(diff==n && left!=right){
                return true;
            }
            else if(diff>n){
                left++;
            }
            else{
                right++;
            }
        }
        return false;
    }
}

//GFG
// FIND PAIR GIVEN DIFFERENCE
