class Solution
{
    static long merge(long arr[], int l,int mid, int r)
    {
        long swaps=0;
        int len1=mid-l+1;
        int len2=r-mid;
        long first[]=new long[len1];
        long second[]=new long[len2];
        
        
        //copy left array
        int k=l;
        for(int i=0;i<len1;i++){
            first[i]=arr[k++];
        }
        
        //copy right array
        k=mid+1;
         for(int i=0;i<len2;i++){
            second[i]=arr[k++];
        }
        
        //merge two arrays
        int index1=0;
        int index2=0;
        k=l;
        
        while(index1<len1 && index2<len2){
            if(first[index1]<=second[index2]){
                arr[k++]=first[index1++];
            }
            else{
                arr[k++]=second[index2++];
                swaps+=(len1-index1);
            }
        }
        
        while(index1<len1){
            arr[k++]=first[index1++];
        }
        
         while(index2<len2){
            arr[k++]=second[index2++];
        }
        return swaps;
        
         
    }
   static long mergeSort(long arr[], int l, int r)
    {
        long cnt=0;
       if(r>l){
      int mid=(l+r)/2;
      
      //sort left part
     cnt+= mergeSort(arr,l,mid);
      
      //sort right part
     cnt+= mergeSort(arr,mid+1,r);
      
     cnt+= merge(arr,l,mid,r);
       }
     return cnt;
    }
    static long inversionCount(long arr[], long N)
    {
       long a=mergeSort(arr,0,arr.length-1);
       return a;
    }
}

//GFG
