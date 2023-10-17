//BRUTE FORCE APPROACH
class Solution
{
     public static int finddis(int arr[],int o){
        int cnt=1;
        int ele=arr[o];
     for(int i=o-1;i>=0;i--){
if(arr[i]>ele){
    return cnt;
}
cnt++;
     }
     return cnt;
    }
    public static int[] calculateSpan(int arr[], int n)
    {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        for(int i=1;i<arr.length;i++){
           int ele= finddis(arr, i);
         l.add(ele);
        }
        int ans[]=new int[n];
        int k=0;
        for(Integer i:l){
            ans[k++]=i;
        }
        return ans;
    }
    
}

//APPROACH 2
class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int arr[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && price[s.peek()]<=price[i]){
                s.pop();
            }
            if(s.isEmpty()){
                arr[i]=i+1;
            }
            else{
                arr[i]=i-s.peek();
            }
            s.push(i);
        }
        
        return arr;
    }
    
}
//GFG
