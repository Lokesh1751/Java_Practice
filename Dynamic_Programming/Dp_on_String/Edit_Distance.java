class Solution {
    public int helper(String a,String b,int i,int j){
        if(i==a.length()){
            return b.length()-j;
        }
        if(j==b.length()){
            return a.length()-i;
        }

        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            return helper(a,b,i+1,j+1);
        }
        else{
            //insert
            int insert=1+helper(a,b,i,j+1);

            // delete
            int delete=1+helper(a,b,i+1,j);

            //replace
            int replace=1+helper(a,b,i+1,j+1);
            ans=Math.min(insert,Math.min(delete,replace));
        }
        return ans;
    }

      public int helpermemo(String a,String b,int i,int j,int dp[][]){
        if(i==a.length()){
            return b.length()-j;
        }
        if(j==b.length()){
            return a.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            return helpermemo(a,b,i+1,j+1,dp);
        }
        else{
            //insert
            int insert=1+helpermemo(a,b,i,j+1,dp);

            // delete
            int delete=1+helpermemo(a,b,i+1,j,dp);

            //replace
            int replace=1+helpermemo(a,b,i+1,j+1,dp);
            dp[i][j]=Math.min(insert,Math.min(delete,replace));
        }
        return dp[i][j];
    }

    public int helpertab(String a,String b){
         int dp[][]=new int[a.length()+1][b.length()+1];
        for(int row[]:dp){
            Arrays.fill(row,0);
        }
        for(int j=0;j<b.length();j++){
            dp[a.length()][j]=b.length()-j;
        }
        for(int i=0;i<a.length();i++){
            dp[i][b.length()]=a.length()-i;
        }

        for(int i=a.length()-1;i>=0;i--){
            for(int j=b.length()-1;j>=0;j--){
            int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            dp[i][j]= dp[i+1][j+1];
        }
        else{
            //insert
            int insert=1+dp[i][j+1];

            // delete
            int delete=1+dp[i+1][j];

            //replace
            int replace=1+dp[i+1][j+1];
            dp[i][j]=Math.min(insert,Math.min(delete,replace));
        }
            }
            
        }
        return dp[0][0];
    }

    public int helperSO(String a, String b) {
        int curr[] = new int[b.length() + 1];
        int next[] = new int[b.length() + 1];
        Arrays.fill(curr, 0);
        Arrays.fill(next, 0);
        for (int j = 0; j < b.length(); j++) {
            next[j] = b.length() - j;
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            for (int j = b.length() - 1; j >= 0; j--) {
                curr[b.length()]=a.length()-i;
                int ans = 0;
                if (a.charAt(i) == b.charAt(j)) {
                    ans = next[j + 1];
                } else {
                    // Insert
                    int insert = 1 + curr[j + 1];

                    // Delete
                    int delete = 1 + next[j];

                    // Replace
                    int replace = 1 + next[j + 1];
                    ans = Math.min(insert, Math.min(delete, replace));
                }
                curr[j]=ans;
            }
            // Copying curr to next
            System.arraycopy(curr, 0, next, 0, curr.length);
        }
        return next[0];
    }

    public int minDistance(String word1, String word2) {
        if(word1.length()==0){
            return word2.length();
        }
        if(word2.length()==0){
            return word1.length();
        }
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helperSO(word1,word2);
    }
}
//LEETCODE
