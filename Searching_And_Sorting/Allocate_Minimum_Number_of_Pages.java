class Solution 
{
    public static boolean isPossible(int arr[],int m,int n,int mid){
        int studentcnt=1;
        int pagesum=0;
        for(int i=0;i<n;i++){
            if(pagesum+arr[i]<=mid){
                pagesum+=arr[i];
            }
            else{
                studentcnt++;
                if(studentcnt>m || arr[i]>mid){
                    return false;
                }
                pagesum=arr[i];
            }
        }
        return true;
        
    }
    public static int findPages(int[]A,int N,int M)
    {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        int s=0;
        int e=sum;
        int mid=s+(e-s)/2;
        int ans=-1;
        
       if(M>N){
           return -1;
       }
            while(s<=e){
            if(isPossible(A,M,N,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
};

//GFG
//CodeStudio=>Books Allocation
//Binary Search
