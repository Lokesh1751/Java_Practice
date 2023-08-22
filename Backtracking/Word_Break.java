class Solution {
    static int dp[]=new int[301];
    public static int help(int i,String s,List<String> wd){
        if(i==s.length()){
            return 1;
        }
        String temp="";
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=i;j<s.length();j++){
          char ch=s.charAt(j);
          temp+=ch;
            if(wd.contains(temp)){
                if(help(j+1,s,wd)==1){
                    return dp[i]=1;
                }
            }
        }
        return dp[i]=0;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(int i=0;i<301;i++){
            dp[i]=-1;
        }
      if(  help(0,s,wordDict)==1){
          return true;
      }
      return false;
    }
}
//LEETCODE
