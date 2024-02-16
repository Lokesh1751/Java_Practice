class Solution{
    static int minimumDays(int S, int N, int M){
        if(M>N){
            return -1;
        }
        int buyingdays=S - S/7;
        int ans=0;
        if((S*M)%N==0){
            ans= (S*M)/N;
        }
        else{
            ans= (S*M)/N +1;
        }
        if(ans<=buyingdays){
            return ans;
        }
        return -1;
    }
}
//GFG
