class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int maxi=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
if(st.isEmpty() && c=='('){
st.push(c);
maxi=Math.max(maxi,st.size());
}
else if(!st.isEmpty() && c==')'){
    st.pop();
}
else if(c=='('){
    st.push(c);
    maxi=Math.max(maxi,st.size());
}
        }
        return maxi;
    }
}
//LEETCODE
