class Solution
{
    static class pair{
        int s;
        int e;
        pair(int s,int e){
            this.s=s;
            this.e=e;
        }
    }
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
         pair arr[]=new pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new pair(start[i],end[i]);
        }
          Arrays.sort(arr, (a, b) -> a.e - b.e);
          int startidx=arr[0].s;
        int endidx=arr[0].e;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(endidx<arr[i].s){
                count++;
                endidx=arr[i].e;
            }
        }
        return count;
    }
}
//GFG
