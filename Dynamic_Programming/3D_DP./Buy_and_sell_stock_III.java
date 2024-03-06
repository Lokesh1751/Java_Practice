class Solution {

 public int helper(int idx,int buy,int prices[],int limit){
 if(idx==prices.length){
     return 0;
 }
 if(limit==0){
     return 0;
 }
 int price=0;
 if(buy==1){

     // Buy karo , Skip Karo
     price= Math.max(-prices[idx]+helper(idx+1,0,prices,limit),0+ helper(idx+1,1,prices,limit));
}
else{

    //Sell Karo , Skip Karo
    price=Math.max(prices[idx]+helper(idx+1,1,prices,limit-1),0+ helper(idx+1,0,prices,limit));
}
return price;
    }


public int helpermemo(int idx,int buy,int prices[],int limit,int dp[][][]){
 if(idx==prices.length){
     return 0;
 }
 if(limit==0){
     return 0;
 }
 if(dp[idx][buy][limit]!=-1){
     return dp[idx][buy][limit];
 }
 int price=0;
 if(buy==1){

     // Buy karo , Skip Karo
     price= Math.max(-prices[idx]+helpermemo(idx+1,0,prices,limit,dp),0+ helpermemo(idx+1,1,prices,limit,dp));
}
else{

    //Sell Karo , Skip Karo
    price=Math.max(prices[idx]+helpermemo(idx+1,1,prices,limit-1,dp),0+ helpermemo(idx+1,0,prices,limit,dp));
}
return dp[idx][buy][limit]= price;
    }



public int helpertab(int[] prices) {
    int dp[][][]=new int[prices.length+1][2][3];

    for(int row[][]:dp){
        for(int smallrow[]:row){
            Arrays.fill(smallrow,0);
        }
    }

    for (int idx = prices.length - 1; idx >= 0; idx--) {
        for (int buy = 0; buy <= 1; buy++) {
            for(int limit=0;limit<=2;limit++){
                int price = 0;
                if (buy == 1) {
                    // Buy karo , Skip Karo
                    price = Math.max(-prices[idx] + dp[idx + 1][0][limit], dp[idx + 1][1][limit]);
                } else {
                    // Sell Karo , Skip Karo
         if(limit>0)
                    price = Math.max(prices[idx] + dp[idx + 1][1][limit-1], dp[idx + 1][0][limit]);
                }
                dp[idx][buy][limit] = price;
            }
        }
    }
    return dp[0][1][2];
}

public int helperSO(int[] prices) {
   int curr[][]=new int[2][3];
   int next[][]=new int[2][3];
     for(int smallrow[]:curr){
                Arrays.fill(smallrow,0);
            }

              for(int smallrow[]:next){
                Arrays.fill(smallrow,0);
            }

    for (int idx = prices.length - 1; idx >= 0; idx--) {
        for (int buy = 0; buy <= 1; buy++) {
            for(int limit=0;limit<=2;limit++){
                int price = 0;
                if (buy == 1) {
                    // Buy karo , Skip Karo
                    price = Math.max(-prices[idx] +next[0][limit], next[1][limit]);
                } else {
                    // Sell Karo , Skip Karo
         if(limit>0)
                    price = Math.max(prices[idx] + next[1][limit-1], next[0][limit]);
                }
               curr[buy][limit] = price;
            }
        }
         for (int i = 0; i < curr.length; i++) {
            System.arraycopy(curr[i], 0, next[i], 0, curr[i].length);
        }
    }
    return next[1][2];
}


    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length+1][2][3];

        for(int row[][]:dp){
            for(int smallrow[]:row){
                Arrays.fill(smallrow,-1);
            }
        }
        return helperSO(prices);
    }
}
//LEETCODE
