class Solution {
    public int calculate(String st) {
        Stack<Integer> s=new Stack<>();
        int result=0;
        int num=0;
        int sign=1;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+'){
result+=sign*num;
num=0;
sign=1;
            }
             else if(ch=='-'){
result+=sign*num;
num=0;
sign=-1;
            }
           else if(ch=='('){
s.push(result);
s.push(sign);
sign=1;
result=0;
            }
            else if(ch==')'){
                result+=sign*num;
                num=0;
                result*=s.pop();
                result+=s.pop();
            }
        }
        if(num!=0){
            result+=sign*num;
        }
        return result;
    }
}
//LEETCODE
