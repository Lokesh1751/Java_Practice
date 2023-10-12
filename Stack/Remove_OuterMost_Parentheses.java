class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(cnt!=0){
                    res.append(c);
                }
                cnt++;
            }
            else{
                if(cnt!=1){
                    res.append(c);
                }
                cnt--;
            }
        }

        return res.toString();
    }
}
//LEETCODE
