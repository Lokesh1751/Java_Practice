class Solution {
    public static int palindromecnt(String s,int leftptr,int rightptr){
        int cnt=0;
        while(leftptr>=0 && rightptr<s.length() &&(s.charAt(leftptr)==s.charAt(rightptr))){
            cnt++;
            leftptr--;
            rightptr++;
        }
        return cnt;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=palindromecnt(s,i,i);

            count+=palindromecnt(s,i,i+1);
        }
        return count;
    }
}

//LEETCODE
