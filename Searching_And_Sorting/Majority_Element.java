class Solution
{
    static int majorityElement(int a[], int size)
    {
        int maxi=Integer.MIN_VALUE;
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> me:hm.entrySet()){
            if(maxi<me.getValue()){
                maxi=me.getValue();
                ans=me.getKey();
            }
        }
       if(maxi>(size/2)){
           return ans;
       }
       else{
           return -1;
       }
    }
}

//GFG
//if any element has count greater than n/2 times than print it else print -1
