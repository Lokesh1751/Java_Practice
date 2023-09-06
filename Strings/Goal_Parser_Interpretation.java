class Solution {
    public String interpret(String command) {
            String ans="";
            for(int i=0;i<command.length();i++){
                char ch=command.charAt(i);
                char ch1='x';
                if(i!=command.length()-1){
                     ch1=command.charAt(i+1);
                }
                if(ch=='(' && ch1==')'){
ans+='o';
                }
                else if(ch=='(' && ch1!=')'){
                    continue;
                }
                else if(ch==')'){
                    continue;
                }
                else{
                    ans+=ch;
                }
            }
            return ans;
    }
}
//LEETCODE
