class Solution {
    public int repeatedStringMatch(String a, String b) {
         int minloop= b.length()/a.length();
        String word=a;
        int cnt=1;
        for(int i=0;i<minloop+2;i++){
            if(a.contains(b)){
                return cnt;
            }
            else{
                a+=word;
                cnt++;
            }
        }
        return -1;
    }
}
//LEETCODE
