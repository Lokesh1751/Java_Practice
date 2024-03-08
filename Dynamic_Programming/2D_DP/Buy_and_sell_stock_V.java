class Solution {

     public int helper(int idx,int buy,int prices[],int fee){
 if(idx==prices.length){
     return 0;
 }
 int price=0;
 if(buy==1){

     // Buy karo , Skip Karo
     price= Math.max(-prices[idx]+helper(idx+1,0,prices,fee),0+ helper(idx+1,1,prices,fee));
}
else{

    //Sell Karo , Skip Karo
    price=Math.max(prices[idx] -fee +helper(idx+1,1,prices,fee),0+ helper(idx+1,0,prices,fee));
}
return price;
    }

     public int helpermemo(int idx,int buy,int prices[],int dp[][],int fee){
 if(idx==prices.length){
     return 0;
 }
 if(dp[idx][buy]!=-1){
     return dp[idx][buy];
 }
 int price=0;
 if(buy==1){

     // Buy karo , Skip Karo
     price= Math.max(-prices[idx]+helpermemo(idx+1,0,prices,dp,fee),0+ helpermemo(idx+1,1,prices,dp,fee));
}
else{

    //Sell Karo , Skip Karo
    price=Math.max(prices[idx]-fee +helpermemo(idx+1,1,prices,dp,fee),0+ helpermemo(idx+1,0,prices,dp,fee));
}
dp[idx][buy]= price;
return dp[idx][buy];
    }

    public int maxProfit(int[] prices, int fee) {

           int dp[][]=new int[prices.length][2];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helpermemo(0,1,prices,dp,fee);
    }
}
//LEETCODE
