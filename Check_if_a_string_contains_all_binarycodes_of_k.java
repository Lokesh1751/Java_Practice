class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k) return false;
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            hs.add(s.substring(i,i+k));
        }
        // coz we have 2 to the power k possible substrings 
        return hs.size()==Math.pow(2,k);
    }
}
//LEETCODE
