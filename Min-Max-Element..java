//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        long mini=Integer.MAX_VALUE;
        long maxi=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(mini>a[i]){
                mini=a[i];
            }
            if(maxi<a[i]){
                maxi=a[i];
            }
        }
         Pair pl=new Pair(mini,maxi);
         return pl;
    }
}
