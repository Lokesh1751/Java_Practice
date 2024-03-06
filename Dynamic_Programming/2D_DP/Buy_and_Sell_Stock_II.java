class Solution {
    public int helper(int idx,int buy,int prices[]){
 if(idx==prices.length){
     return 0;
 }
 int price=0;
 if(buy==1){

     // Buy karo , Skip Karo
     price= Math.max(-prices[idx]+helper(idx+1,0,prices),0+ helper(idx+1,1,prices));
}
else{

    //Sell Karo , Skip Karo
    price=Math.max(prices[idx]+helper(idx+1,1,prices),0+ helper(idx+1,0,prices));
}
return price;
    }

     public int helpermemo(int idx,int buy,int prices[],int dp[][]){
 if(idx==prices.length){
     return 0;
 }
 if(dp[idx][buy]!=-1){
     return dp[idx][buy];
 }
 int price=0;
 if(buy==1){

     // Buy karo , Skip Karo
     price= Math.max(-prices[idx]+helpermemo(idx+1,0,prices,dp),0+ helpermemo(idx+1,1,prices,dp));
}
else{

    //Sell Karo , Skip Karo
    price=Math.max(prices[idx]+helpermemo(idx+1,1,prices,dp),0+ helpermemo(idx+1,0,prices,dp));
}
dp[idx][buy]= price;
return dp[idx][buy];
    }
    
public int helpertab(int[] prices) {
    int dp[][] = new int[prices.length + 1][2];
    
    for (int row[] : dp) {
        Arrays.fill(row, 0);
    }

    for (int idx = prices.length - 1; idx >= 0; idx--) {
        for (int buy = 0; buy <= 1; buy++) {
            int price = 0;
            if (buy == 1) {
                // Buy karo , Skip Karo
                price = Math.max(-prices[idx] + dp[idx + 1][0], dp[idx + 1][1]);
            } else {
                // Sell Karo , Skip Karo
                price = Math.max(prices[idx] + dp[idx + 1][1], dp[idx + 1][0]);
            }
            dp[idx][buy] = price;
        }
    }
    return dp[0][1];
}


public int helperSO(int[] prices) {
    int curr[]=new int[2];
    int next[]=new int[2];
    Arrays.fill(curr,0);
    Arrays.fill(next,0);

    for (int idx = prices.length - 1; idx >= 0; idx--) {
        for (int buy = 0; buy <= 1; buy++) {
            int price = 0;
            if (buy == 1) {
                // Buy karo , Skip Karo
                price = Math.max(-prices[idx] +next[0], next[1]);
            } else {
                // Sell Karo , Skip Karo
                price = Math.max(prices[idx] + next[1], next[0]);
            }
            curr[buy] = price;
        }
        next=Arrays.copyOf(curr,curr.length);
    }
    return next[1];
}


    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helperSO(prices);
    }
}
//LEETCODE
