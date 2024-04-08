class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open=new Stack<>();
        Stack<Integer> star=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open.add(i);
            }
            else if(c=='*'){
                star.add(i);
            }
            else{
                if(!open.isEmpty()){
                    open.pop();
                }
                   else if(!star.isEmpty()){
                    star.pop();
                   } 
                   else{
                    return false;
                   }
            }
        }
        while(!open.isEmpty()){
            if(star.isEmpty()){
                return false;
            }
            else if(open.peek()<star.peek()){
                open.pop();
                star.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
//LEETCODE
