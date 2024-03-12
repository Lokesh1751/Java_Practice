class Solution {
    public boolean helper(String s,String p,int i,int j){
        if(i<0 && j<0){
            return true;
        }
        if(i>=0 && j<0){
            return false;
        }
        if(i<0 && j>=0){
           for(int k=0;k<=j;k++){
            if(p.charAt(k)!='*'){
                return false;
            }
           }
           return true;
        }
        if(s.charAt(i)==p.charAt(j)){
            return helper(s,p,i-1,j-1);
        }
        else if(p.charAt(j)=='?'){
            return helper(s,p,i-1,j-1);
        }
        else if(p.charAt(j)=='*'){
            return helper(s,p,i-1,j) || helper(s,p,i,j-1);
        }
        else{
            return false;
        }
    }

     public boolean helpermemo(String s, String p, int i, int j, boolean[][] dp) {
    if (i < 0 && j < 0) {
        return true;
    }
    if (i >= 0 && j < 0) {
        return false;
    }
    if (i < 0 && j >= 0) {
        for (int k = 0; k <= j; k++) {
            if (p.charAt(k) != '*') {
                return false;
            }
        }
        return true;
    }
    if (dp[i][j]) {
        return true;
    }
    if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
        return dp[i][j] = helpermemo(s, p, i - 1, j - 1, dp);
    } else if (p.charAt(j) == '*') {
        return dp[i][j] = helpermemo(s, p, i - 1, j, dp) || helpermemo(s, p, i, j - 1, dp);
    } else {
        return false;
    }
}
    public boolean helpertab(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Fill the first row of dp
        for (int j = 1; j <= n; j++) {
           boolean flag=true;
           for(int k=1;k<=j;k++){
            if(p.charAt(k-1)!='*'){
                flag=false;
                break;
            }
           }
           dp[0][j]=flag;
        }

        // Fill the dp table iteratively
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }
public boolean isMatch(String s, String p) {
    boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
    for (boolean[] row : dp) {
        Arrays.fill(row, false);
    }
    return helpertab(s, p);
}
}

//LEETCODE
