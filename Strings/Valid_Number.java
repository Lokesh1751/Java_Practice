class Solution {
    public boolean isNumber(String s) {
        boolean point =false;
        boolean number=false;
        boolean exp=false;
        boolean signal=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='-' || ch=='+'){
                if(signal || number) return false;
                signal=true;
            }
            else if(ch=='.'){
                if(exp || point)return false;
                signal=true;
                point=true;
            }
            else if(ch>='0' && ch<='9'){
                number =true;
            }
            else if(ch=='e' || ch=='E'){
                if(exp || !number) return false;
                exp=true;
                signal=false;
                number=false;
            }
            else{
                return false;
            }
        }
        return number;
    }
}
//LEETCODE
