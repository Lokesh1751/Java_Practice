class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        PriorityQueue<Long> ans=new PriorityQueue<>();
        for(Long i:arr){
            ans.add(i);
        }
        long sol=0;
        while(ans.size()>1){
            long el1=ans.poll();
            long el2=ans.poll();
            long sum=el1+el2;
            ans.add(sum);
            sol+=sum;
        }
        return sol;
    }
}
//GFG
