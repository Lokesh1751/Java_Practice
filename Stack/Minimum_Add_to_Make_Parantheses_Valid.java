class Solution {
    public int minAddToMakeValid(String s) {
         Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.empty()){
                st.push(ch);
            }
            else if(st.peek()=='(' && ch==')'){
                st.pop();
            }
             else if(st.peek()=='[' && ch==']'){
                st.pop();
            }
             else if(st.peek()=='{' && ch=='}'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
       return st.size();
    }
}
//LEETCODE
//Approach 2
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')' && open > 0) {
                open--;
            } else {
                close++;
            }
        }

        return open + close;
    }
}
