class Solution{
    public String removeConsecutiveCharacter(String S){
       
       char curr='#';
       String str="";
       for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
           if(curr!=ch){
               str+=ch;
           }
           curr=ch;
       }
       return str;
    }
}
//gfg
