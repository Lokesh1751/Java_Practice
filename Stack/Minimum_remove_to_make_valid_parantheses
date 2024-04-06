class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder ans=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            if(c==')'){
                if(st.isEmpty()){
                    ans.setCharAt(i,'#');
                }
                else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            ans.setCharAt(st.pop(),'#');
        }
            String res="";
            for(int i=0;i<ans.length();i++){
                if(ans.charAt(i)!='#'){
                    res+=ans.charAt(i);
                }
            }
            return res;
    }
}
//LEETCODE
