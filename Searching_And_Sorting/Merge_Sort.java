class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int mid=(l+r)/2;
        int len1=mid-l+1;
        int len2=r-mid;
        int first[]=new int[len1];
        int second[]=new int[len2];
        
        
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
            if(first[index1]<second[index2]){
                arr[k++]=first[index1++];
            }
            else{
                arr[k++]=second[index2++];
            }
        }
        
        while(index1<len1){
            arr[k++]=first[index1++];
        }
        
         while(index2<len2){
            arr[k++]=second[index2++];
        }
        
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
            return;
        }
      int mid=(l+r)/2;
      
      //sort left part
      mergeSort(arr,l,mid);
      
      //sort right part
      mergeSort(arr,mid+1,r);
      
      merge(arr,l,arr.length,r);
    }
}

//GFG
