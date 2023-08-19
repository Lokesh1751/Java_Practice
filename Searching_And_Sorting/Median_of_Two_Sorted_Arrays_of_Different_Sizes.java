//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
       int arr[]=new int[n+m];
       int k=0;
       int i=0;
       int j=0;
       while(i<n && j<m){
           if(a[i]<b[j]){
               arr[k++]=a[i++];
           }
           else{
               arr[k++]=b[j++];
           }
       }
    while(i<n){
        arr[k++]=a[i++]; 
    }
    while(j<m){
       
            arr[k++]=b[j++];   
    }
    
    int x=arr.length;
    if(x%2==0){
        int w=x/2;
        int r=w-1;
        double e1=arr[w];
        double e2=arr[r];
        double avg=(e1+e2)/2;
        return avg;
    }
        double d=arr[x/2];
        return d;
    }
}

//GFG
