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
