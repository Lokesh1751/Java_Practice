class Solution {
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int num=0;
        char operator='+';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if(isOperator(c) || i==s.length()-1){
                if(operator=='+'){
                    st.push(num);
                }
                if(operator=='-'){
                    st.push(-num);
                }
                if(operator=='*'){
                    st.push(st.pop()*num);
                }
                if(operator=='/'){
                    st.push(st.pop()/num);
                }
                num=0;
                operator=c;
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
//LEETCODE
// Approach
// 1)Create a stack.
// 2)Read each character from the input string.
// 3)If the character is a digit, push its value onto the stack.
// 4)If the character is an operator, pop the top two values from the stack, perform the operation, and push the result back onto the stack.
// 5)Repeat steps 3 and 4 until the end of the input string is reached.
// 6)The result of the expression is the value at the top of the stack.
