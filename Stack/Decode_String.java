class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
               Stack<Integer> st2=new Stack<>();
       int currnum=0;
       String currstr="";
       for(Character c:s.toCharArray()){
           if(c=='['){
               st.add(currstr);
               st2.add(currnum);
               currstr="";
               currnum=0;
           }
           else if(c==']'){
              int num=st2.pop();
              String prevstr=st.pop();
               String temp="";
               for(int i=0;i<num;i++){
                   temp+=currstr;
               }
               currstr=prevstr+temp;
           }
           else if(Character.isDigit(c)){
               currnum=currnum*10+(c-'0');
           }
           else{
               currstr+=c;
           }
       }
return currstr;
    }
}
//LEETCODE
