class Solution {
    public int titleToNumber(String c) {
        int output=0;
        for(int i=0;i<c.length();i++){
            output=output*26+(c.charAt(i)-'A'+1);
        }
        return output;
    }
}
//LEETCODE
