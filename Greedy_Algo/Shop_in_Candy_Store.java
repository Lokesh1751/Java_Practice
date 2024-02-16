class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        Arrays.sort(candies);
        ArrayList<Integer> ans=new ArrayList<>();
int mini=0;
int buy=0;
int free=N-1;
while(buy<=free){
    mini=mini+candies[buy];
    buy++;
    free=free-K;
}

int maxi=0;
int buy2=N-1;
int free2=0;
while(free2<=buy2){
    maxi=maxi+candies[buy2];
    buy2--;
    free2=free2+K;
}
ans.add(mini);
ans.add(maxi);
return ans;
        
    }
}
//GFG
