class Solution {
    public boolean isPalindrome(String s) {
      s=s.toUpperCase();
       int i=0;
       int j=s.length()-1;
       if(s.isEmpty()){
           return true;
       }
       while(i<=j){
           char ch=s.charAt(i);
           char ch1=s.charAt(j);
       if(!Character.isLetterOrDigit(ch)){
           i++;
       }
       else  if(!Character.isLetterOrDigit(ch1)){
           j--;
       }
          else {
          if(ch!=ch1){
               return false;

           }
           i++;
           j--;
          }
           
           
       }
       return true;
    }
}

//LEETCODE
