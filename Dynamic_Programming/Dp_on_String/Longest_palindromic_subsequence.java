class Solution {
    public int helpermemo(String s1,String s2,int i,int j,int dp[][]){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]= 1+helpermemo(s1,s2,i+1,j+1,dp);
            return dp[i][j];
        }
        else{
            dp[i][j]= Math.max(helpermemo(s1,s2,i+1,j,dp),helpermemo(s1,s2,i,j+1,dp));
            return dp[i][j];
        }
    }

    public int longestPalindromeSubseq(String s) {

        // find Longest Common subsequence from str and reverse of str
        StringBuilder str=new StringBuilder(s);
        String s2=str.reverse().toString();
        int dp[][]=new int[s.length()+1][s2.length()+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helpermemo(s, s2, 0,0,dp);
    }
}

//LEETCODE

