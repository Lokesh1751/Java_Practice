//APPROACH 1 WITH TLE
class Solution {
    static  long mod=1000000007;
    public static boolean checkkar(String s){
        for(int i=0;i<s.length()%mod;i++){
            char ch=s.charAt(i);
            if(ch!='1'){
                return false;
            }
        }
        return true;
    }
    public int numSub(String s) {
        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<s.length()%mod;i++){
            for(int j=i;j<s.length()%mod;j++){
                String temp=s.substring(i,j+1);
               if(checkkar(temp)){
                   a.add(temp);
               }
            }
        }
        long cnt=a.size();
        return (int)(cnt%mod);
    }
}
//LEETCODE
