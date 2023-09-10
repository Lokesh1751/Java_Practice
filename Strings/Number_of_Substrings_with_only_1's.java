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


//APPROACH 2 VERY VERY EASY
class Solution {
    public int numSub(String s) {
        int count=0,total=0,mod=1_000_000_007;
        for(char c:s.toCharArray()){
            if(c=='1'){
                count++;
            }
            else{
                count=0;
            }
            total=(total+count)%mod;
        }
        return total;
    }
}

//LEETCODE
