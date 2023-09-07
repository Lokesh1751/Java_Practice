class Solution {
    public boolean checkOnesSegment(String s) {
        int pos=0;
        while(s.charAt(pos)=='1'){
            pos++;
            if(pos==s.length()){
                return true;
            }
        }
        int cnt=0;
        for(int i=pos;i<s.length();i++){
            if(s.charAt(i)=='0'){
cnt++;


            }
            else if( s.charAt(i)=='1'){
                return false;
            }
        }
        return true;
    }
}
